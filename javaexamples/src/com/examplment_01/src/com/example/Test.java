package com.example;

import com.example.entity.Employee;


public class Test {
    public static void main(String[] args) {
        Employee employee = new Employee("BO","销售");
        System.out.println(employee.getEmployeeName());
        System.out.println(employee.getDepartment());
        updateemplyeeName(employee,"Sun");
        System.out.println(employee.getEmployeeName());
    }

    /**
     * 需求+1，修改指定员工姓名
     * @李景阳 em
     * @李景阳 newName
     */
    private static void updateemplyeeName(Employee em,String newName){
        em.setEmployeeName(newName);
    }
}
