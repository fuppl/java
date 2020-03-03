package com.example.entity;

public class Teacher extends Person {
    private String teachertitle;
    private int publishnumber;

    public Teacher(int usernumber,String username, String teachertitle,int publishnumber) {
        super(usernumber,username);
        this.teachertitle = teachertitle;
        this.publishnumber=publishnumber;
    }

    public String getTeachertitle() {
        return teachertitle;
    }

    public void setTeachertitle(String teachertitle) {
        this.teachertitle = teachertitle;
    }

    public int getPublishnumber() {
        return publishnumber;
    }

    public void setPublishnumber(int publishnumber) {
        this.publishnumber = publishnumber;
    }
}
