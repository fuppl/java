package com.example.resourse;

import com.example.entity.Person;
import com.example.entity.Student;
import com.example.entity.Teacher;

public class Database {
    private static Person[] presons=create();
    private static Person[] create(){
        Student student1=new Student(1, "a", "1ban", 50);
        Student student2=new Student(2, "b", "1ban", 60);
        Student student3=new Student(3, "c", "2ban", 100);
        Teacher t1=new Teacher(4, "e","lecture",20);
        Teacher t2=new Teacher(5, "f", "professionor", 100);
        Teacher t3=new Teacher(6, "g", "lecture", 50);
        Person [] p={student1,student2,student3,t1,t2,t3};
        return p;
    }

    public static Person[] getPersons(){
        return presons;
    }

}
