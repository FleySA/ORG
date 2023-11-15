package com.telran.org.homework_3;

class CreditCard {
    private String cardNumber;
    private int pin;
    private double balance;
    private String currencyType;

    public CreditCard(String cardNumber, int pin, double balance, String currencyType) {
        this.cardNumber = cardNumber;
        this.pin = pin;
        this.balance = balance;
        this.currencyType = currencyType;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public int getPin() {
        return pin;
    }

    public double getBalance() {
        return balance;
    }

    public void updateBalance(double amount) {
        this.balance += amount;
    }

    public String getCurrencyType() {
        return currencyType;
    }
}