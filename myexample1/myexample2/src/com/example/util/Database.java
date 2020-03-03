package com.example.util;

import com.example.entity.Apple;

import java.util.List;

public class Database {
    private static List<Apple> apples = create();
    private static List<Apple> create(){
        Apple apple = new Apple(1, Apple.Color.RED, 200);
        Apple apple1 = new Apple(2, Apple.Color.GREEN,250);
        Apple apple2 = new Apple(3, Apple.Color.RED,260);
        Apple apple3 = new Apple(4, Apple.Color.GREEN,230);

        return List.of(apple,apple1,apple2,apple3);
    }

    public static List<Apple> getApples(){
        return apples;
    }
}
