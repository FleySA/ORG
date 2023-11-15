package com.telran.org.homework_7;



    public class Main {
        public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 10, 15, 13, 22, 1, 4, 6, 10};
        CustomIterator customIterator = new CustomIterator(numbers);

        while (customIterator.hasNext()) {
            int nextValue = customIterator.next();
            System.out.print(nextValue + " ");
        }
        }
    }