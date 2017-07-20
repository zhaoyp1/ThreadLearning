package com.zhaoyp.study;

/**
 * Created by zhaoyp on 2017-07-20.
 */
public class MyRunnable implements Runnable {
    public void run() {

        for (int i=0 ; i<10; i++){

            int time =(int)( Math.random()*1000);
            try {
                Thread.sleep(time);
                System.out.println("run="+Thread.currentThread().getName());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }

    public static void main(String[] args) {
        Thread thread = new Thread(new MyRunnable());
        thread.setName("run");
        thread.start();

        for (int i=0 ; i<10 ; i++){
            int time =(int)( Math.random()*1000);
            try {
                Thread.sleep(time);
                System.out.println("main="+Thread.currentThread().getName());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }



    }
}
