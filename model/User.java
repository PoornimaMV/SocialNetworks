package com.example.courseapi.model;


import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Table(name="[users]")
public class User {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long userId;

    @JsonIgnore
    @OneToMany(cascade=CascadeType.ALL)
    @JoinColumn(name="postuser_Id")
    private List<Post> posts;


    @JsonIgnore
    @OneToMany(cascade=CascadeType.ALL)
    @JoinColumn(name="expressed_by")
    private List<Reaction> reactions=new ArrayList<>();

    @JsonIgnore
    @OneToMany(cascade=CascadeType.ALL)
    @JoinColumn(name="user_Id")
    private List<Relation> relations=new ArrayList<>();

    @JsonIgnore
    @OneToMany(cascade=CascadeType.ALL)
    @JoinColumn(name="friend_id")
    private List<Request> requests=new ArrayList<>();



    /*@OneToMany
    private  List<Reaction> reactions=new ArrayList<>();

    @OneToMany
*/

    private String userName;
    private String  mailId;
    private Long phoneNo;
    private Date dob;
    private String gender;
    private String password;


    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getMailId() {
        return mailId;
    }

    public void setMailId(String mailId) {
        this.mailId = mailId;
    }

    public Long getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(Long phoneNo) {
        this.phoneNo = phoneNo;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }



    public String getGender() {
        return gender;
    }



    public void setGender(String gender) {
        this.gender = gender;
    }



    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<Post> getPosts() {
        return posts;
    }

    public void setPosts(List<Post> posts) {
        this.posts = posts;
    }

    public List<Reaction> getReactions() {
        return reactions;
    }

    public void setReactions(List<Reaction> reactions) {
        this.reactions = reactions;
    }

    public List<Relation> getRelations() {
        return relations;
    }

    public void setRelations(List<Relation> relations) {
        this.relations = relations;
    }

    public List<Request> getRequests() {
        return requests;
    }

    public void setRequests(List<Request> requests) {
        this.requests = requests;
    }

}
