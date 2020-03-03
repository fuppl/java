package com.example;

public class Mythread extends Thread {
    @Override
    public void run(){
        try{
            System.out.println("3000毫秒后会显示");
            Thread.sleep(3000);
            System.out.println("李老四真他妈帅");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
