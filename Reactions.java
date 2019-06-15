package com.example.courseapi.model;



import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name="[reactions]")
public class Reactions {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long reactionId;
    private String expressedBy;
    private  String reactions;
    private String comments;
    private  String pictureLocation;
    public Long getReactionId() {
        return reactionId;
    }

    public void setReactionId(Long reactionId) {
        this.reactionId = reactionId;
    }

    public String getExpressedBy() {
        return expressedBy;
    }

    public void setExpressedBy(String expressedBy) {
        this.expressedBy = expressedBy;
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



}
