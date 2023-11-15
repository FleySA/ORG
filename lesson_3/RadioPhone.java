package com.telran.org.lesson_3;

public class RadioPhone extends Phone {

    private String radioModule;

    private void changeWave() {

    }

    @Override
    public void receiveCall() {
        changeWave();
        if (radioModule != null) {
            System.out.println("I am ready to get call");
        }
    }
}