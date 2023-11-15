 package com.telran.org.lesson_3.party;

public abstract class Guest {

    private String name;

    private String gender;

    private int age;

    public Guest(String name, String gender, int age) {
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void printGreetings() {
        System.out.println("Hello I am " + name);
    }
}