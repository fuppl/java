package com.example.test;

import com.example.entity.ILearnable;
import com.example.entity.Student;

public class Test {
    public static void main(String[] args) {
        Student s1 = new Student("lilaosi");

        s1.setiLearnable(new ILearnable() {
            @Override
            public void read() {
                System.out.println(s1.getName()+"以自己的方式学习");
            }
        });
        s1.getiLearnable().read();

        Student s2 = new Student("lalala");

        s2.setiLearnable(new ILearnable() {
            @Override
            public void read() {
                System.out.println("学习，学个屁！！！");
            }
        });
        s2.getiLearnable().read();

        Student s3 = new Student("abc");
        ILearnable iLearnable = () -> {
            System.out.println("老子爱咋学咋学");
        };
        s3.setiLearnable(iLearnable);// todo 将函数作为参数传入，函数式编程
        s3.getiLearnable().read();
    }
}
