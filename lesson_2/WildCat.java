package com.telran.org.lesson_2;

public class WildCat extends Cat {

    public WildCat(int age) {
        super(age);
    }

    @Override
    public void voice() {
        //super.voice();
        System.out.println("AAAAAAAAAAAAAA!!");
    }
}
