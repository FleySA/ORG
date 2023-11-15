package com.telran.org.lesson_2;

public class Lesson_2App {
    public static void main(String[] args) {
        Cat cat = new Cat(15);
        cat.voice();
        cat.setColor("Red, ");

        WildCat wildCat = new WildCat(10);
        wildCat.voice();
        int age = wildCat.getAge();
        wildCat.setColor(" ");
        wildCat.setColor("White, ");


        LitleCat litleCat = new LitleCat(5);
        litleCat.voice();
        litleCat.jump();
        litleCat.setColor("Yellow, ");

        BigCat bigCat = new BigCat(12);
        bigCat.getHeight();
        bigCat.setColor("Black, ");

        SeaCat seaCat = new SeaCat(6);
        seaCat.voice();
        seaCat.setColor("Blue");
        //seaCat.setAge(35);
        seaCat.setHeight(15);
        seaCat.swim();

        System.out.println("Cat color : " + cat.getColor() + "Age = " + cat.getAge());
        System.out.println("WildCat color : " + wildCat.getColor() + "Age = " + wildCat.getAge());
        System.out.println("LittleCat color : " + litleCat.getColor() + "Age = " + litleCat.getAge());
        System.out.println("SeaCat color : " + seaCat.getColor() + "Age = " + seaCat.getAge());

    }
}

