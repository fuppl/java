package com.example;

import java.util.Random;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Counter {
    private static int count=0;
    private static final Random RANDOM =new Random();
    public static synchronized void increment() {
        try {
            Thread.sleep(RANDOM.nextInt(10));
            count++;
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static int getCount() {
        return count;
    }

    private static final Lock LOCK =new ReentrantLock();
    public static void incrementByLock(){
        try {
            Thread.sleep(RANDOM.nextInt(10));
            LOCK.lock();
            count++;
        } catch (InterruptedException e) {
        } finally {
            LOCK.unlock();
        }
    }

}
