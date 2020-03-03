package com;

import com.example.service.DataService;
import com.example.service.impl.DataServiceImpl;

import java.time.LocalDate;

public class Test {
    public static void main(String[] args) {
        DataService dataService=new DataServiceImpl();
        dataService.howLong();
        System.out.println("现在是开学第几周");
        System.out.println(dataService.getWeek(LocalDate.now()));
    }
}
