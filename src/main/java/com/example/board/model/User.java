package com.example.board.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModel;

import java.time.LocalDate;
import java.util.Date;

@ApiModel
public class User {
    private int uid;
    private String userId;
    private String email;
    private String userName;
    @JsonFormat(pattern = "yyyy-mm-dd")
    private Date createdAt;

    public User(int uid, String userId, String email, String userName, Date createdAt) {
        this.uid=uid;
        this.userId=userId;
        this.email=email;
        this.userName=userName;
        this.createdAt=createdAt;
    }

    public User() {

    }

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }
}
