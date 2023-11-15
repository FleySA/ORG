package com.telran.org.lesson_3;

public class PhoneApp {

    public static void main(String[] args) {

        Phone radioPhone = new RadioPhone();
        Phone satPhone = new SatPhone();

        Phone[] phones = {radioPhone, satPhone};

        for (Phone phone : phones) {
            phone.call();
            phone.receiveCall();
        }
    }
}