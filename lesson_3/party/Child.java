package com.telran.org.lesson_3.party;

public class Child extends Guest implements Sleep{

    public Child(String name, String gender, int age) {
        super(name, gender, age);
    }

    @Override
    public void sleep() {
        System.out.println("I am " + super.getName() + " and I want to sleep");
    }
}