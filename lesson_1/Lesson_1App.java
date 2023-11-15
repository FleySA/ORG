package com.telran.org.lesson_1;

public class Lesson_1App {

    public static void main(String[] args) {

        Dog shepard = new Dog();
         shepard.setColor("White");
         shepard.setAge(30);
         shepard.setBreed("shepard") ;

        Dog angryDog = new Dog();
        angryDog.setBreed("yard");
        angryDog.setColor("Black");
        angryDog.setAge(10);


        Dog litleDog = new Dog("LitleDog", "red");
        litleDog.setAge(5);

        Dog bigDog = new Dog("big dog", "black", 20, 10);



        System.out.println(shepard);
        System.out.println(angryDog);
        System.out.println(litleDog);
        System.out.println(bigDog);

        System.out.println("Color is " + angryDog.getColor());
        System.out.println("Breed is " + angryDog.getBreed());
        System.out.println("Age is " + angryDog.getAge());
    }
}
