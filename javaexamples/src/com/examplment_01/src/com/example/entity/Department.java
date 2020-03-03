package com.example.entity;

public class Department {
    //部门编号
    private int depatmentNumeber;
    //部门名称
    private String departmentName;

    public Department(int depatmentNumeber,String departmentName){
        this.departmentName=departmentName;
        this.depatmentNumeber=depatmentNumeber;
    }

    public int getDepatmentNumeber(){
        return depatmentNumeber;
    }
    public void setDepatmentNumeber(int depatmentNumeber){
        this.depatmentNumeber=depatmentNumeber;
    }

    public String getDepartmentName(){
        return departmentName;
    }
    public void setDepartmentName(String departmentName){
        this.departmentName=departmentName;
    }
}
