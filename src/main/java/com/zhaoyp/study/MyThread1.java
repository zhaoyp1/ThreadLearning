package com.zhaoyp.study;

/**
 * Created by zhaoyp on 2017-07-20.
 */
public class MyThread1 extends Thread{
    private    int count=100;

    public MyThread1(String name){
        this.setName(name);//设置线程名称
    }
    public void run() {
         while (count>0){
             count--;
             System.out.println(Thread.currentThread().getName()+",count值:"+count);

         }
    }


    public static void main(String[] args) {
        MyThread1 myThread1 = new MyThread1("A");
        /*myThread1.start();
        MyThread1 myThread12 = new MyThread1("B");
        myThread12.start();*/
        Thread thread = new Thread(myThread1);
        thread.start();
        Thread thread2 = new Thread(myThread1);
        thread2.start();
    }


}
