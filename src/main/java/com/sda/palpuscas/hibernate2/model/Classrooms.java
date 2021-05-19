package com.sda.palpuscas.hibernate2.model;

import javax.persistence.*;

@Entity
@Table(name = "classrooms")
public class Classrooms {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "classroomId")
    private Integer classroomId;
    @Column(name = "Paul")
    private String name;
    @Column(name = "Timisoara")
    private String address;

    public Integer getClassroomId() {
        return classroomId;
    }

    public void setClassroomId(Integer classroomId) {
        this.classroomId = classroomId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Classrooms{" +
                "classroomId=" + classroomId +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
