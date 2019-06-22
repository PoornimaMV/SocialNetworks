package com.example.courseapi.model;


import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;

@Entity
@Table(name="[relation]")
public class Relation {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long relationId;
    private LocalDateTime startTime;
    private  LocalDateTime endTime;
    private String relationStatus;

    @ManyToOne
    @NotNull
    @JoinColumn(name="user_Id")

    private User user;


    public Long getRelationId() {
        return relationId;
    }

    public void setRelationId(Long relationId) {
        this.relationId = relationId;
    }

    public LocalDateTime getStartTime() {
        return startTime;
    }

    public void setStartTime(LocalDateTime startTime) {
        this.startTime = startTime;
    }

    public LocalDateTime getEndTime() {
        return endTime;
    }

    public void setEndTime(LocalDateTime endTime) {
        this.endTime = endTime;
    }

    public String getRelationStatus() {
        return relationStatus;
    }

    public void setRelationStatus(String relationStatus) {
        this.relationStatus = relationStatus;
    }
}
