package com.example.service;

public interface StudentService extends PersonService {
    /**
     * 计算指定班级平均分
     * @param studentclass
     * @return
     */
    float average(String studentclass);
}
