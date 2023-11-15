package com.telran.org.homework_5;

public class Odd {
    public static String evenOrOdd(int number){

        if (number%2 == 0){
            return "Even";
        } else {
            return "Odd";
               }
        }
        public static void main (String[] args){
            int num = 7;
            String result = evenOrOdd(num);
            System.out.println(result);
        }

}
