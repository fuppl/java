package com.example.test;

import com.example.entity.HelloRunnable;
import com.example.entity.HelloThread;

public class Test {
    public static void main(String[] args) {
        //Runnable
        Thread t = new Thread(new HelloRunnable());
        t.start();

        //Thread
        new HelloThread().start();
    }
}

