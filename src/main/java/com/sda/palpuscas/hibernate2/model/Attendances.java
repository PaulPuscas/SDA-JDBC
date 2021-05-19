package com.sda.palpuscas.hibernate2.model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "attendances")
public class Attendances {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "attendanceId")
    private Integer attendanceId;
    @Column(name = "creationDate")
    private Date creationDate;
    @Column(name = "isPresent")
    private boolean isPresent;
    @ManyToOne
    @JoinColumn(name = "moduleId")
    private Integer moduleId;
    @ManyToOne
    @JoinColumn(name = "personId")
    private Integer personId;


    public Integer getAttendanceId() {
        return attendanceId;
    }

    public void setAttendanceId(Integer attendanceId) {
        this.attendanceId = attendanceId;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public boolean isPresent() {
        return isPresent;
    }

    public void setPresent(boolean present) {
        isPresent = present;
    }

    public Integer getModuleId() {
        return moduleId;
    }

    public void setModuleId(Integer moduleId) {
        this.moduleId = moduleId;
    }

    public Integer getPersonId() {
        return personId;
    }

    public void setPersonId(Integer personId) {
        this.personId = personId;
    }

    @Override
    public String toString() {
        return "Attendances{" +
                "attendanceId=" + attendanceId +
                ", creationDate=" + creationDate +
                ", isPresent=" + isPresent +
                ", moduleId=" + moduleId +
                ", personId=" + personId +
                '}';
    }
}
