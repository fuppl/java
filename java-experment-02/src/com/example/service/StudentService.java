package com.example.service;
import com.example.entity.Student;
import com.example.resourse.DatabaseUtils;

public class StudentService {
    /**
     * 基于for each打印数组中所有学生姓名及成绩
     */
    public static void printstudent(){

        for(Student s:DatabaseUtils.liststudents()){
            System.out.println(s.getName()+"/"+s.getMark());
        }
    }
    /**
     * 基于指定学号，指定班级编号，返回指定学生对象，若学生不存在，返回NULL
     * @param number 学号
     * @param classnumber 班级编号
     */

    public static Student returnstudent(int classnumber,int number){
        Student student=null;
        for(Student s:DatabaseUtils.liststudents()) {
            if (s.getClassnumber() == classnumber && s.getNumber() == number){
                return s;}
        }
        return student;
    }


    /**
     * 根据指定班级编号，计算平均分
     * @param classnumber 班级编号
     * @return 班级平均分
     */
    public static float average(int classnumber){
        int jishuqi=0;
        float m=0;
        for(Student s:DatabaseUtils.liststudents()){
            if(s.getClassnumber()==classnumber){
                jishuqi++;
                m+=s.getMark();
            }
        }
        m/=jishuqi;
        return m;
    }
}
