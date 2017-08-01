package com.zhaoyp.study;


/**
 * Created by zhaoyp on 2017-07-26.
 */
public class Subtract {
    private String lock;

    public Subtract(String lock){
        this.lock = lock;
    }

    public void  subtract(){

        try{
            synchronized (lock){
                if(ValueObject.list.size()==0){
                    System.out.println("wait begin ThreadName="+Thread.currentThread().getName());
                    lock.wait();
                    System.out.print("wait end ThreadName="+Thread.currentThread().getName());

                }
                ValueObject.list.remove(0);
                System.out.println("list size "+ValueObject.list.size());


            }

        }catch (InterruptedException e ){

        }

    }

}
