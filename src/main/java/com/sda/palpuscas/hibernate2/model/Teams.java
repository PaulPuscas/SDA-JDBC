package com.sda.palpuscas.hibernate2.model;

import javax.persistence.criteria.CriteriaBuilder;

public class Teams {
    private Integer teamId;
    private String name;

    public Integer getTeamId() {
        return teamId;
    }

    public void setTeamId(Integer teamId) {
        this.teamId = teamId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Teams{" +
                "teamId=" + teamId +
                ", name='" + name + '\'' +
                '}';
    }
}
