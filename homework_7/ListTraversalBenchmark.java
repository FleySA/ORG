package com.telran.org.homework_7;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ListTraversalBenchmark {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        int size = 10000000;

        // Заполнение списка
        for (int i = 0; i < size; i++) {
            list.add(i);
        }

        // Замер времени для for-each loop
        long startTime = System.nanoTime();
        for (int i : list) {
            int temp = i;
        }
        long endTime = System.nanoTime();
        System.out.println("For-each loop: " + (endTime - startTime) + " ns");

        // Замер времени для classic for (list.size() на каждой итерации)
        startTime = System.nanoTime();
        for (int i = 0; i < list.size(); i++) {
            int temp = list.size();
        }
        endTime = System.nanoTime();
        System.out.println("Classic for with list.size(): " + (endTime - startTime) + " ns");

        // Замер времени для classic for (list.size() в переменной)
        int listSize = list.size();
        startTime = System.nanoTime();
        for (int i = 0; i < listSize; i++) {
            int temp = listSize;
        }
        endTime = System.nanoTime();
        System.out.println("Classic for with cached list.size(): " + (endTime - startTime) + " ns");

        // Замер времени для classic for (обратный порядок)
        startTime = System.nanoTime();
        for (int i = listSize - 1; i >= 0; i--) {
            int temp = listSize;
        }
        endTime = System.nanoTime();
        System.out.println("Classic for in reverse order: " + (endTime - startTime) + " ns");

        // Замер времени для использования Iterator
        startTime = System.nanoTime();
        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()) {
            int temp = iterator.next();
        }
        endTime = System.nanoTime();
        System.out.println("Using Iterator: " + (endTime - startTime) + " ns");

        // Замер времени для использования ListIterator
        startTime = System.nanoTime();
        ListIterator<Integer> listIterator = list.listIterator();
        while (listIterator.hasNext()) {
            int temp = listIterator.next();
        }
        endTime = System.nanoTime();
        System.out.println("Using ListIterator: " + (endTime - startTime) + " ns");
    }
}