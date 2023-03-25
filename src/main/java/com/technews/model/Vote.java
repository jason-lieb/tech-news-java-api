package com.technews.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@Table(name = "vote")
public class Vote implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer Id;
    private Integer userId;
    private Integer postId;

    public Vote() {
    }

    public Vote(Integer id, Integer userId, Integer postId) {
        Id = id;
        this.userId = userId;
        this.postId = postId;
    }

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getPostId() {
        return postId;
    }

    public void setPostId(Integer postId) {
        this.postId = postId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Vote vote = (Vote) o;
        return Objects.equals(Id, vote.Id) && Objects.equals(userId, vote.userId) && Objects.equals(postId, vote.postId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(Id, userId, postId);
    }

    @Override
    public String toString() {
        return "Vote{" +
                "Id=" + Id +
                ", userId=" + userId +
                ", postId=" + postId +
                '}';
    }
}
