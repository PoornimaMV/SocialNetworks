package com.example.courseapi.model;



import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;

@Entity
@Table(name="[reactions]")
public class Reaction {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long reactionId;

    private  String reactions;
    private String comments;
    private  String pictureLocation;


    @ManyToOne
    @NotNull
    @JoinColumn(name="expressed_by")
    private User user;

    @ManyToOne
    @NotNull
    @JoinColumn(name="post_id")
    private Post post;


    public Long getReactionId() {
        return reactionId;
    }

    public void setReactionId(Long reactionId) {
        this.reactionId = reactionId;
    }



    public String getReactions() {
        return reactions;
    }

    public void setReactions(String reactions) {
        this.reactions = reactions;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public String getPictureLocation() {
        return pictureLocation;
    }

    public void setPictureLocation(String pictureLocation) {
        this.pictureLocation = pictureLocation;
    }


    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Post getPost() {
        return post;
    }

    public void setPost(Post post) {
        this.post = post;
    }
}
