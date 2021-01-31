package com.example.space4;

import java.io.Serializable;

public class Inventionsjavaclass implements Serializable {
// java class for the recyclerview
    private int img;
    private  String name;
    private String topic;

    public Inventionsjavaclass(int img, String name, String topic) {
        this.img = img;
        this.name = name;
        this.topic = topic;
    }

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }
}
