package com.utopia.java.lang.common;

/**
 * @author utopia on 2020/4/5
 */
public class Student {

    public synchronized void waiting() throws InterruptedException {

        System.out.println("I am waiting");
        wait();
        System.out.println("I am finish waiting");
    }

    public synchronized void sleep(){
        System.out.println("I am sleeping");
        try {
            Thread.sleep(1000000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("I wake up");
//        notify();

    }

    public synchronized void goToBed(){
        System.out.println("go to bed");
    }


}