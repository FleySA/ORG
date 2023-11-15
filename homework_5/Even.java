package com.telran.org.homework_5;

import java.util.Scanner;

public class Even {
    public static String chislo(int number) {
        if (number % 2 == 0) {
            return "Chislo chetnoe";

        } else {

            return "Chislo ne chetnoe";
        }

    }

    public  static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("введите число: ");
        int number = scanner.nextInt();
        String result = chislo(number);
        System.out.println(result);
    }
}
