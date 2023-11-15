package com.telran.org.homework_3;

class SparkasseATM extends ATM {

    public SparkasseATM(String atmName, double availableAmountUSD) {
        super(atmName, availableAmountUSD);
    }

    @Override
    public void withdraw(CreditCard card, int amount) {
        if (amount <= availableAmountUSD) {
            card.updateBalance(-amount);
            availableAmountUSD -= amount;
            System.out.println("Снятие " + amount + " EUR прошло успешно в банкомате:" + atmName + ".");
        } else {
            System.out.println("Недостаточно средств в банкомате: " + atmName + ".");
        }
    }

    @Override
    public void deposit(CreditCard card, int amount) {
        card.updateBalance(amount);
        availableAmountUSD += amount;
        System.out.println("Внесение " + amount + " EUR прошло успешно в банкомате:" + atmName + ".");
    }

    @Override
    public boolean checkPin(CreditCard card, int enteredPin) {
        return card.getPin() == enteredPin;
    }
}