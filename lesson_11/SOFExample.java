package com.telran.org.lesson_11;


public class SOFExample {
    /// print ///
    /// print ///
    /// print ///
    /// main ///
    private static int count = 0;
    public static void main(String[] args) {
        print();
    }
    private static void print(){      // beskonechnaya rekursiya kotoraya vizivaet oschibku
        System.out.println(" count " + count++);
        print();
    }
}
