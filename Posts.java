

package com.example.courseapi.model;


import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name="[posts]")
public class Posts {


    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long postId;


    private String postLocation;
    private String postType;
    private String postText;
    private LocalDateTime postedDate;
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








}
