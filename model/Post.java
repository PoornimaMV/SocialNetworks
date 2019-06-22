

package com.example.courseapi.model;


import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="[posts]")
public class Post {


    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long postId;

    private String postLocation;
    private String postType;
    private String postText;
    private LocalDateTime postedDate;


    @ManyToOne
    @NotNull
    @JoinColumn(name="postuser_id",referencedColumnName = "userId")
    private User user;

    @JsonIgnore
    @OneToMany(cascade=CascadeType.ALL)
    @JoinColumn(name="post_id")
    private List<Reaction> posts=new ArrayList<>();


   /* @OneToMany
    private List<Reaction> reactionsList;
    */
    public Long getPostId() {
        return postId;
    }

    public void setPostId(Long postId) {
        this.postId = postId;
    }

    public String getPostLocation() {
        return postLocation;
    }

    public void setPostLocation(String postLocation) {
        this.postLocation = postLocation;
    }

    public String getPostType() {
        return postType;
    }

    public void setPostType(String postType) {
        this.postType = postType;
    }

    public String getPostText() {
        return postText;
    }

    public void setPostText(String postText) {
        this.postText = postText;
    }

    public LocalDateTime getPostedDate() {
        return postedDate;
    }

    public void setPostedDate(LocalDateTime postedDate) {
        this.postedDate = postedDate;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }


}
