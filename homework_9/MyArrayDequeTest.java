package com.telran.org.homework_9;

import java.util.ArrayDeque;

public class MyArrayDequeTest {
    public static void main(String[] args) {
        MyArrayDeque myDeque = new MyArrayDeque();
        ArrayDeque<Integer> arrayDeque = new ArrayDeque<>();
        // Добавьте 10 элементов в начало
        for (int i = 1; i <= 10; i++) {
            myDeque.addToHead(i);
            arrayDeque.addFirst(i);
        }
        System.out.println("Добавляем 10 элементов в начало myDeque: " + myDeque);
        System.out.println("Добавляем 10 элементов в начало arrayDeque: " + arrayDeque);

        // Добавьте 12 элементов в конец
        for (int i = 11; i <= 22; i++) {
            myDeque.addTotail(i);
            arrayDeque.addLast(i);
        }
        System.out.println("Добавляем 12 элементов в конец myDeque: " + myDeque);
        System.out.println("Добавляем 12 элементов в конец arrayDeque: " + arrayDeque);
        System.out.println();

        // Удалите 4 элемента с хвоста
        for (int i = 0; i < 4; i++) {
            myDeque.removeTail();
            arrayDeque.pollLast();
        }
        System.out.println("Удаляем  4 элемента с хвоста myDeque: " + myDeque);
        System.out.println("Удаляем  4 элемента с хвоста arrayDeque: " + arrayDeque);

        // Удалите 2 элемента с головы
        for (int i = 0; i < 2; i++) {
            myDeque.removeHead();
            arrayDeque.pollFirst();
        }
        System.out.println("Удаляем  2 элемента с головы myDeque myDeque: " + myDeque);
        System.out.println("Удаляем  2 элемента с головы arrayDeque myDeque: " + arrayDeque);
        System.out.println("Peek Head: " + myDeque.peekHead());
        System.out.println("Peek Tail: " + myDeque.peekTail());
        System.out.println("MyArrayDeque: " + myDeque);
        System.out.println("ArrayDeque: " + arrayDeque);

        if (myDeque.toString().equals(arrayDeque.toString())) {
            System.out.println("Результаты совпадают.");
        } else {
            System.out.println("Результаты не совпадают.");
        }
    }
}