package com.example.entity;

public class Person {
    private int usernumber;
    private String username;

    public Person(int usernumber,String username) {
        this.usernumber = usernumber;
        this.username=username;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getUsernumber() {
        return usernumber;
    }

    public void setUsernumber(int usernumber) {
        this.usernumber = usernumber;
    }
}
