package com.telran.org.lesson_3.party;

public class Man extends Guest implements DrinkAlcohol{

    public Man(String name, int age) {
        super(name, "M", age);
    }

    @Override
    public void drink() {
        System.out.println("I am " + super.getName() + " and I want to drink");
    }

    public void printHello() {
        System.out.println("Hello I am man");
    }

}