package com.example;

import com.example.entity.Department;
import com.example.entity.Employee;

public class Test {
    public static void main(String[] args) {
        Department department1 = new Department(000, "销售");
        Department department2 = new Department(111, "研发");
        Employee employee = new Employee("abc", 123, true, department1);
        Employee employee1 = new Employee("bcd", 234, true, department2);
        System.out.println(department1.getDepatmentNumeber() +" "+ department1.getDepartmentName());
        System.out.println(employee.getEmployeeNumber() +" "+ employee.getEmployeeName());
        updateEmpoyeeName(employee, "SUN");
        System.out.println(employee.getEmployeeName());
    }

    /**
     * 需求+1，修改指定员工的姓名
     *
     * @param em
     * @param newName
     */
    private static void updateEmpoyeeName(Employee em, String newName) {
        em.setEmployeeName(newName);
    }
}
