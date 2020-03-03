package com.example.service.impl;

import com.example.entity.Person;
import com.example.entity.Student;
import com.example.resourse.Database;
import com.example.service.StudentService;

public  class StudentServiceImpl extends PersonServiceImpl implements StudentService {
    @Override
    public float average(String studentclass){
        float sum=0;
        int amount=0;
        for(Person p: Database.getPersons()){
            if(p instanceof Student){
                Student s=(Student)p;
                if(studentclass.equals(s.getStudentclass())){
                    sum+=s.getStudentgrade();
                    amount++;
                }
            }
        }
        return amount==0?0:sum/amount;
    }



}
