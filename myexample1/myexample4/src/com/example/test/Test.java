package com.example.test;

import com.example.entity.Entity;
import com.example.exception.MyException;

import java.sql.SQLOutput;

public class Test {
    public static void main(String[] args) throws MyException {
        double a = 1d;
        double b = 0;

        System.out.println(Entity.divide(a,b));
        System.out.println(Entity.divide(a, 1d));

    }
}
