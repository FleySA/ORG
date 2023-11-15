package com.telran.org.lesson_10;

public class CompareExemple {
    public static void main(String[] args) {
        int a= 7;
        int b = 7;
        boolean isEqual = a == b;

        System.out.println("primitive a == b " + isEqual);

        int c = 7;
        Integer d = new Integer(7); Integer.valueOf(7);
        boolean isEqualsWithObject = c == d;

        System.out.println("Object and primitive c == " + isEqualsWithObject);



        Integer e = Integer.valueOf(100);// Integer - от (-128) до (127)
        Integer w = Integer.valueOf(100);

        System.out.println("Object == object - " + (e == w));


    }
}
