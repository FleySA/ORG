package com.telran.org.homework_3;



import java.util.Scanner;

public class MainApplication {

    public static void main(String[] args) {
        ATM[] atms = new ATM[4];
        atms[0] = new ATBATM("ATB Банкомат", 5000);
        atms[1] = new DeutscheBankATM("DeutscheBank Банкомат", 10000);
        atms[2] = new SparkasseATM("Sparkasse Банкомат", 7000);

        // Создаем кредитную карту
        CreditCard card = new CreditCard("1234567890", 1234, 1000.0, "EUR");

        Scanner scanner = new Scanner(System.in);

        for (ATM atm : atms) {
            if (atm instanceof Converter) {
              System.out.print("Введите PIN: ");
              int enteredPin = scanner.nextInt();

                if (atm.checkPin(card, enteredPin)) {
                    System.out.print("Введите сумму для снятия в EUR: ");
                    int amountInEUR = scanner.nextInt();

                    Converter converter = (Converter) atm;
                    double amountInUSD = converter.convert(amountInEUR);
                    atm.withdraw(card, (int) amountInUSD);

                    //System.out.println("Снятие прошло успешно.");
                    System.out.println("Обновленный баланс карты: " + card.getBalance() + " " + card.getCurrencyType());
                    System.out.println("Доступная сумма в банкомате: " + atm.getAvailableAmountUSD() + " USD");
                } else {
                    System.out.println("Неверный PIN. Доступ запрещен.");
                }

            }
        }

    }
}