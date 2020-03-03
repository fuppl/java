package com.example.test;

public class InterputTest {

    public static void main(String[] args) throws InterruptedException {
        System.out.println("main thread starts");
        Thread t = new Thread(() -> {
            for(int i = 0; i < 5; i++){
                System.out.println(i);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    System.out.println("Interrupted");
                    //return;
                }
            }
        });

        t.start();
        Thread.sleep(2000);
        t.interrupt();
        t.join();

        System.out.println("main thread ends");
    }
}
