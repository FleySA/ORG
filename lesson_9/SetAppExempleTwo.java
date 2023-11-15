package com.telran.org.lesson_9;

import com.telran.org.lessonfive.Person;

import java.util.HashSet;
import java.util.Set;

public class SetAppExempleTwo {
    public static void main (String[] args) {
        Set<Integer> integerSet = new HashSet<>();
        integerSet.add(5);
        integerSet.add(4);
        integerSet.add(3);
        integerSet.add(2);
        integerSet.add(2);
        integerSet.add(11);
        System.out.println(integerSet);
        System.out.println("Contains 3 is :" + integerSet.contains(3));

        integerSet.remove(2);
        System.out.println( "Set size " + integerSet );


        Person two = new Person("Two");
        Person one = new Person("One");
        Set<Person> personSet = new HashSet<>();
        personSet.add (two);
        personSet.add(one);
        System.out.println(personSet);
    }
}
