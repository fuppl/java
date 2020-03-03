package com.example.resourse;
import com.example.entity.Student;
public class DatabaseUtils {
    private static final Student[] STUDENTS =creatstudent();
    /**
     * 创建测试用数组
     */
    private static Student[] creatstudent(){
        Student student1=new Student("ddd", 123, 100, 1);
        Student student2=new Student("aaa", 234, 50, 1);
        Student student3=new Student("qqq",345,60, 2);
        Student student4=new Student("www", 456, 70, 2);
        Student student5=new Student("rrr", 567, 55, 2);
        return new Student[]{student1,student2,student3,student4,student5};
    }
    public static Student[] liststudents(){
        return STUDENTS;
    }

}
