package com.telran.org.homework_3;

class DeutscheBankATM extends ATM implements Converter {

    public DeutscheBankATM(String atmName, double availableAmountUSD) {
        super(atmName, availableAmountUSD);
    }

    @Override
    public void withdraw(CreditCard card, int amount) {
        if (amount <= availableAmountUSD) {
            card.updateBalance(-amount);
            availableAmountUSD -= amount;
            System.out.println("Снятие " + amount + " EUR прошло успешно в банкомате:" + atmName + ".");
        } else {
            System.out.println("Недостаточно средств в банкомате в банкомате: " + atmName + ".");
        }
    }

    @Override
    public void deposit(CreditCard card, int amount) {
        card.updateBalance(amount);
        availableAmountUSD += amount;
        System.out.println("Внесение " + amount + " EUR прошло успешно в банкомате: "  + atmName + ".");
    }

    @Override
    public boolean checkPin(CreditCard card, int enteredPin) {
        return card.getPin() == enteredPin;
    }

    @Override
    public double convert(double amountInEUR) {
        // Реализация конвертации EUR в USD для DeutscheBank
        return amountInEUR * 1.15;
    }
}
