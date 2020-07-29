package com.thoughtworks.playgrounds.Spring.Playgrounds.model;

import org.springframework.boot.autoconfigure.domain.EntityScan;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "user_permission", schema = "public")
public class User {
    @Column(name = "user_id")
    private String userId;
    @Column(name = "username")
    private String username;
    @Column(name = "user_department")
    private String userDepartment;
    @Column(name = "user_permission")
    private String userPermission;

    public User(){

    }

    public User(String userId, String username, String userDepartment, String userPermission) {
        this.userId = userId;
        this.username = username;
        this.userDepartment = userDepartment;
        this.userPermission = userPermission;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUserDepartment() {
        return userDepartment;
    }

    public void setUserDepartment(String userDepartment) {
        this.userDepartment = userDepartment;
    }

    public String getUserPermission() {
        return userPermission;
    }

    public void setUserPermission(String userPermission) {
        this.userPermission = userPermission;
    }
}
