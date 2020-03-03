package com.example.service.impl;

import com.example.entity.Person;
import com.example.entity.Teacher;
import com.example.resourse.Database;
import com.example.service.TeacherService;

public  class TeacherServiceImpl extends PersonServiceImpl implements TeacherService {
    @Override
    public int publishzongnumber(String teachertitle){
        int sum=0;
        for(Person p: Database.getPersons()){
            if(p instanceof Teacher){
                Teacher t=(Teacher)p;
                if(teachertitle.equals(t.getTeachertitle())){
                    sum+=t.getPublishnumber();
                }
            }

        }
        return sum;
    }



}
