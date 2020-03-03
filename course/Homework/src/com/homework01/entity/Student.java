package com.homework01.entity;

public class Student {
    //姓名
    private static String name;
    //学号
    private static int number;
    //专业
    private static String major;
    //性别
    private static String sex;
    enum sex{
        male,female
    }

    public Student(String name,int number,String major,String sex){
        Student.name =name;
        Student.number =number;
        Student.major =major;
        Student.sex =sex;
    }

    public String getName(){
        return name;
    }
    public void setName(String name){
        Student.name =name;
    }
    public int getNumber(){
        return number;
    }
    public void setNumber(int number){
        Student.number =number;
    }
    public String getMajor(){
        return major;
    }
    public void setMajor(String major){
        Student.major =major;
    }
    public String getSex(){
        return sex;
    }
    public void setSex(String sex){
        Student.sex =sex;
    }

}
