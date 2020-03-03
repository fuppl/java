package com.example.entity;

public class Employee2 {
    //员工姓名
    private String employeeName;
    //员工号
    private int employeeNumber;
    //在职
    private boolean service=true;
    //部门
    private String department;

    public  Employee2(String employeeName,int employeeNumber,String department){
        this.employeeName=employeeName;
        this.employeeNumber=employeeNumber;
        this.department=department;
    }

    public String getEmployeeName(){
        return employeeName;
    }
    public void setEmployeeName(String employeeName){
        this.employeeName=employeeName;
    }

    public int getEmployeeNumber() {
        return employeeNumber;
    }
    public void setEmployeeNumber(int employeeNumber){
        this.employeeNumber=employeeNumber;
    }

    public boolean getservice(){
        return service;
    }
    public void setService(boolean service){
        this.service=service;
    }

    public String getDepartmentName(){
        return department;
    }
    public void setDepartmentName(String department){
        this.department=department;
    }
}
