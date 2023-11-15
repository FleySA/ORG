package com.telran.org.lesson_1;

public class Dog {

    private  String breed;
    private int age;
    private String color;
    private int weight;

    public Dog() {
        System.out.println("HELLO from constructor without params!!");
    }

    public Dog(String breed, String color) {
        System.out.println("HELLO from constructor with params!!");
        this.breed = breed;
        this.color = color;
    }
    public Dog(String breed, String color, int age, int weight) {

        this.breed = breed;
        this.color = color;
        this.age = age;
        this.weight = weight;

    }


    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age<0) {
            return;
        }
        this.age = age;
    }

    public void setColor(String color){
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "breed='" + breed + '\'' +
                ", age=" + age +
                ", color='" + color + '\'' +
                ", weight=" + weight +
                '}';
    }
}
