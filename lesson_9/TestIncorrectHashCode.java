package com.telran.org.lesson_9;

import java.util.HashSet;

public class TestIncorrectHashCode {

    public static void main(String[] args) {
        Man alex = new Man("Alex");
        Man petr = new Man("Alex");
        HashSet<Man> manHashSet = new HashSet<>();
        manHashSet.add(alex);
        manHashSet.add(petr);

        System.out.println("Size = " + manHashSet.size());
    }
}