package com.zhaoyp.study;

/**
 * Created by zhaoyp on 2017-07-26.
 */
public class Add {

    private String lock;


    public Add(String lock){
        super();
        this.lock = lock;
    }

    public void  add(){

        synchronized (lock){
            ValueObject.list.add("anyString");
            lock.notifyAll();
        }
    }

}
