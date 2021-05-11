package com.sda.palpuscas.hibernate.model;

import javax.persistence.*;

@Entity
@Table(name = "project")
public class Project {
    @Column(name = "projectId")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer projectId;
    @Column(name = "name")
    private String name;

    public Integer getProjectId() {
        return projectId;
    }

    public void setProjectId(Integer projectId) {
        this.projectId = projectId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
