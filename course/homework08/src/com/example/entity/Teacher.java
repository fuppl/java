package com.example.entity;

public class Teacher {
    private int id;
    private String tname;

    public Teacher(int id, String tname) {
        this.id = id;
        this.tname = tname;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTname() {
        return tname;
    }

    public void setTname(String tname) {
        this.tname = tname;
    }
}
