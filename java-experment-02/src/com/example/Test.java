package com.example;

import com.example.entity.Student;
import com.example.service.StudentService;

public class Test {
    public static void main(String[] args) {
        int mark[]={94,60,55,100,80};
        int i;
        for(i=0;i<5;i++){
            if(mark[i]<60)
                System.out.println(mark[i]);
        }
        for(int e:mark){
            if(e<60) System.out.println(e);
        }


        int classnumber=1,number=123;
        Student stu;
        stu= StudentService.returnstudent(classnumber, number);
        System.out.println("姓名"+stu.getName());

        float m=StudentService.average(1);
        System.out.println(classnumber+"班平均分为"+m);
    }
}
