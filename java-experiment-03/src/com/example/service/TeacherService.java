package com.example.service;

public interface TeacherService extends PersonService {
    /**
     * 计算指定教师职称的出版物数量
     * @param teachertitle
     * @return
     */
    int publishzongnumber(String teachertitle);
}
