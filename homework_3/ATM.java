package com.telran.org.homework_3;

abstract class ATM {
    protected String atmName;
    protected double availableAmountUSD;

    public ATM(String atmName, double availableAmountUSD) {
        this.atmName = atmName;
        this.availableAmountUSD = availableAmountUSD;
    }

    // Метод снятия денег
    public abstract void withdraw(CreditCard card, int amount);

    // Метод внесения денег
    public abstract void deposit(CreditCard card, int amount);

    // Метод проверки PIN кода
    public abstract boolean checkPin(CreditCard card, int enteredPin);

    public String getAtmName() {
        return atmName;
    }

    public double getAvailableAmountUSD() {
        return availableAmountUSD;
    }
}