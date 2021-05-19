package com.sda.palpuscas.hibernate2.model;

public class Topics {

    private Integer topicId;
    private String name;

    public Integer getTopicId() {
        return topicId;
    }

    public void setTopicId(Integer topicId) {
        this.topicId = topicId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Topics{" +
                "topicId=" + topicId +
                ", name='" + name + '\'' +
                '}';
    }
}
