package com.telran.org.Lesson_4;

public class ChildTwo extends Parent {

    public static String HELLO = "Hello";

    public static void printHello() {
        System.out.println("Hello I am child two");
    }

    @Override
    public void printGreetings() {
        System.out.println("Hello I am child two" + name);
    }

    public void printAll() {
        printGreetings();
        printThanks();
        printWishes();
    }
}
