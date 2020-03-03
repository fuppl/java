package com.example.entity;

import com.example.exception.MyException;

public class Entity {
    public static double divide(double divisor, double dividend) throws MyException {
        if (dividend == 0){
            throw new MyException("被除数为0");
        }
        return divisor/dividend;
    }
}
