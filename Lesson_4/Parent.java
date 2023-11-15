package com.telran.org.Lesson_4;

public class Parent {

    protected String name;

    public void printGreetings() {
        System.out.println("Hello I am parent");
    }

    public final void printThanks() {
        System.out.println("Thank you");
    }

    protected void printWishes() {
        System.out.println("I wish you ...");
    }
}
