package com.telran.org.lesson_10;

import java.util.Comparator;

public class SortPersonByName implements Comparator<Person> {

    @Override
    public int compare(Person o1, Person o2) {
        return o1.getName().compareTo(o2.getName());
    }
}