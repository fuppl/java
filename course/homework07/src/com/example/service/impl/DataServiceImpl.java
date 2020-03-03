package com.example.service.impl;

import com.example.service.DataService;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class DataServiceImpl implements DataService {
    @Override
    public void howLong() {
        final LocalDateTime dt=LocalDateTime.of(1998, 6, 27, 11, 45);
        System.out.println("到运行时李老四共活了多少时间：");
        System.out.println(dt.until(LocalDateTime.now(), ChronoUnit.YEARS)+"years");
        System.out.println(dt.until(LocalDateTime.now(), ChronoUnit.MONTHS)+"months");
        System.out.println(dt.until(LocalDateTime.now(), ChronoUnit.DAYS)+"days");
        System.out.println(dt.until(LocalDateTime.now(), ChronoUnit.HOURS)+"hours");
        System.out.println(dt.until(LocalDateTime.now(), ChronoUnit.MINUTES)+"minutes");
        System.out.println(dt.until(LocalDateTime.now(), ChronoUnit.SECONDS)+"secouds");
    }

    @Override
    public int getWeek(LocalDate date) {
        final LocalDate d=LocalDate.of(2019, 2, 25);
        return (int)(d.until(date, ChronoUnit.WEEKS));
    }
}
