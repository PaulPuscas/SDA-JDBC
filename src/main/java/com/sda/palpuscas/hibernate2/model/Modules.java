package com.sda.palpuscas.hibernate2.model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "modules")
public class Modules {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "moduleId")
    private Integer moduleId;
    @Column(name = "startDate")
    private Date startDate;
    @Column(name = "endDate")
    private Date endDate;
    @ManyToMany
    @JoinColumn(name = "teamId")
    private Integer teamId;
    @ManyToOne
    @JoinColumn(name = "topicId")
    private Integer topicId;
    @ManyToOne
    @JoinColumn(name = "person")
    private Persons person;
    @ManyToOne
    @JoinColumn(name = "classroomId")
    private Integer classroomId;




}
