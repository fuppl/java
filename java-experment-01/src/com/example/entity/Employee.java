    package com.example.entity;

    public class Employee {
        //员工姓名
        private String employeeName;
        //员工号
        private int employeeNumber;
        //在职
        private boolean service=true;
        //部门
        private Department department;

        public Employee(String employeeName, int employeeNumber, boolean service, Department department) {
            this.employeeName = employeeName;
            this.employeeNumber = employeeNumber;
            this.service = service;
            this.department = department;
        }

        public String getEmployeeName() {
            return employeeName;
        }

        public void setEmployeeName(String employeeName) {
            this.employeeName = employeeName;
        }

        public int getEmployeeNumber() {
            return employeeNumber;
        }

        public void setEmployeeNumber(int employeeNumber) {
            this.employeeNumber = employeeNumber;
        }

        public boolean isService() {
            return service;
        }

        public void setService(boolean service) {
            this.service = service;
        }

        public Department getDepartment() {
            return department;
        }

        public void setDepartment(Department department) {
            this.department = department;
        }
    }
