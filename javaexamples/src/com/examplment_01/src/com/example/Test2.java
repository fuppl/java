package com.example;

import com.example.entity.Department;
import com.example.entity.Employee2;

public class Test2 {
    public static void main(String[] args) {
        Department depart = new Department(17, "开发");
        Employee2 employee=new Employee2("老四",110,"开发");
        System.out.println(employee.getDepartmentName());
        System.out.println(employee.getEmployeeNumber());
    }
}