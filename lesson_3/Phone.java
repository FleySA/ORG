package com.telran.org.lesson_3;

public abstract class Phone {

    public void call() {
        System.out.println("Call to number");
    }

    public abstract void receiveCall();
}