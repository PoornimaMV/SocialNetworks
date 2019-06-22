package com.example.courseapi.model;



import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;

@Entity
@Table(name="[requests]")
public class Request {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long requestId;
    private String status;


    @ManyToOne
    @NotNull
    @JoinColumn(name="friend_id",referencedColumnName = "userId")
    private User user;

    @OneToOne
    @NotNull
    @JoinColumn(name="userId",referencedColumnName = "userId")
    private User users;


    public Long getRequestId() {
        return requestId;
    }

    public void setRequestId(Long requestId) {
        this.requestId = requestId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public User getUsers() {
        return users;
    }

    public void setUsers(User users) {
        this.users = users;
    }
}
