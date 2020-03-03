package com.example;

import com.example.Counter;
import com.example.Mythread;

import java.time.LocalTime;

public class Test {
    public static void main(String[] args) throws InterruptedException {
         myThreadTest();
        RunnableTest();
         interruptTest();
         counterTest();
        counterByLockTest();
    }

    /**
     * 测试MyThread类的执行
     */
    private static void myThreadTest() {
        Mythread m=new Mythread();
        m.start();
    }

    /**
     * 创建一个任务，让当前执行线程休眠1秒后，打印线程名称，以及当前时间
     * 创建10个线程，执行以上任务
     * 快捷键：fori，生成步进for循环代码
     */
    private static void RunnableTest() {
        Runnable r=()->{
            try {
                Thread.sleep(1000);
                System.out.println(Thread.currentThread().getName()+" "+ LocalTime.now());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        };
        for( int i=0;i<10;i++){
            new Thread(r).start();
        }
    }

    /**
     * 创建一个任务，在任务中创建一个整型变量，实现无限循环打印累加整数，每打印一次线程休眠1秒
     * 创建一个线程对象执行任务，在主线程休眠5秒后，中断任务
     * @throws InterruptedException
     */
    private static void interruptTest() throws InterruptedException {
        Runnable r=()->{
           int i=0;
           while(true){
               try {
                   Thread.sleep(1000);
                   System.out.println(i++);
               } catch (InterruptedException e) {
                   System.out.println("啊");
                   return;
               }

           }
        };
        Thread thread=new Thread(r);
        thread.start();
        thread.sleep(5000);
        System.out.println("呵");
        thread.interrupt();
    }

    /**
     * 创建一个Counter类，添加整数static变量count，随机数Random常量对象
     * 在Counter类中声明一个static方法increment()，实现任何执行线程随机休眠0-10毫秒后，变量count+1
     * 在此方法测试Count类
     * 创建3000个线程，执行increment()方法增加变量操作，在所有子线程结束后，查看变量结果
     * while (Thread.activeCount() > 2){}，语句可判断创建的线程全部执行完毕
     *
     * 结果与预期不符，使用同步锁锁定多线程下方法的执行，重新执行测试，查看结果
     */
    private static void counterTest() {
        for (int i = 0; i < 3000; i++) {
            new Thread(Counter::increment).start();
        }
        while (Thread.activeCount() != 2){}
        System.out.println(Counter.getCount());
    }

    /**
     * 在Counter类中创建Lock类型常量
     * 创建静态方法incrementByLock()，基于Lock接口实现操作的锁定，同样随机休眠线程，注意锁的释放
     *
     * 在此方法创建3000线程，执行基于Lock锁的方法
     * 对比基于synchronized与Lock的执行效率，可调整线程数量
     */
    private static void counterByLockTest() {
        for (int i = 0; i < 3000; i++) {
            new Thread(Counter::incrementByLock).start();
        }
        while (Thread.activeCount() != 2){}
        System.out.println(Counter.getCount());
    }

}
