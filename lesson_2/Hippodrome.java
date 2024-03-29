package com.telran.org.lesson_2;

public class Hippodrome {

    public static void main(String[] args) {
        Cat catOne = new Cat(15);
        Cat catTwo = new Cat(10);
        Cat catThree = new Cat(5);
        WildCat wildCat = new WildCat(20);
        SeaCat seaCat = new SeaCat(10);

        Cat[] cats = {catOne, catTwo, catThree, wildCat, seaCat};
        run(cats);
        //run (catOne, catTwo);
        //run(wildCat);

    }

    private static void run(Cat[] cats) {
        for (Cat cat : cats) {
            cat.voice();
        }
    }
}