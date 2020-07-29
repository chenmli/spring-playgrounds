package com.thoughtworks.playgrounds.Spring.Playgrounds.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "projects",schema = "public")
public class Project {
    @Column(name = "user_id")
    private String userId;

    @Column(name = "username")
    private String username;

    @Column(name = "user_department")
    private String userDepartment;

    @Column(name = "project_name")
    private String projectName;

    @Column(name = "project_desc")
    private String projectDesc;

    @Column(name = "project_desc_optional")
    private String projectDescOptional;

    public Project()
    {

    }

    public Project(String userId, String username, String userDepartment, String projectName, String projectDesc, String projectDescOptional) {
        this.userId = userId;
        this.username = username;
        this.userDepartment = userDepartment;
        this.projectName = projectName;
        this.projectDesc = projectDesc;
        this.projectDescOptional = projectDescOptional;
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

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public String getProjectDesc() {
        return projectDesc;
    }

    public void setProjectDesc(String projectDesc) {
        this.projectDesc = projectDesc;
    }

    public String getProjectDescOptional() {
        return projectDescOptional;
    }

    public void setProjectDescOptional(String projectDescOptional) {
        this.projectDescOptional = projectDescOptional;
    }
}
