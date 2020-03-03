package com.example.service;

import com.example.entity.Person;

public interface PersonService {
    /**
     * 实现，模拟基于编号返回用户
     * @param usernumber
     * @return
     */
    Person findbyusernumber(int usernumber);
}
