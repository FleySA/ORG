package com.telran.org.lesson_10;

import java.util.Comparator;

public class SortPersonByAge implements Comparator<Person> {

    @Override
    public int compare(Person o1, Person o2) {

        return o1.getAge() - o2.getAge();


    }
}

