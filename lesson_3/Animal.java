package com.telran.org.lesson_3;

public abstract class Animal {

    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract boolean eat(String plants);

    public abstract void see();

}