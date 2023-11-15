package com.telran.org.lesson_3;

public interface Flyable {

    void fly();

    default void  canFly() {
        System.out.println("Mogu letatb! ");
    }
}
