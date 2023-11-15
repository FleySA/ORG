package com.telran.org.homework_6;

import java.util.ArrayList;
import java.util.List;

import static com.telran.org.homework_6.DublicatRemovalExample.removeDuplicates;
import static com.telran.org.homework_6.EvenList.numbers;
import static com.telran.org.homework_6.IntSpiski.doubleValues;
import static com.telran.org.homework_6.StringSpiski.getLengths;


public class SpiskiApp {
    public static void main(String[] args){
        List<Integer> intList = new ArrayList<>();
        intList.add(1);
        intList.add(2);
        intList.add(3);
        intList.add(4);
        intList.add(5);
        System.out.println("Начальный список_1 : " + intList);

        List<Integer> doubledList = doubleValues(intList);
        System.out.print( "Список умноженный на 2 : " + doubledList);
        System.out.println();

        List<Integer> inputList = new ArrayList<>();
        inputList.add(5);
        inputList.add(6);
        inputList.add(7);
        inputList.add(8);
        inputList.add(9);
        System.out.println("Начальный список_2 : " + inputList);

        List<Integer> oddNumbersList = numbers(inputList);
        System.out.println("Нечётные элементы из списка_2" + oddNumbersList);

        List<String> listString = new ArrayList<>();
        listString.add("Hello!");
        listString.add("World!");
        listString.add("Morgen!");
        listString.add("Java!");
        listString.add("Chao!");
        System.out.println("Начальный список 3: " + listString);

        List<Integer> lengths = getLengths(listString);
        System.out.print( "Список длины каждого из значений списка 3 : " + lengths);
        System.out.println();

        List<String> inputList1 = new ArrayList<>();
        inputList1.add("apple");
        inputList1.add("banana");
        inputList1.add("cherry");
        inputList1.add("apple");
        inputList1.add("date");
        inputList1.add("banana");
        System.out.println("Начальный список с дубликатами : " + inputList1);

        List<String> uniqueList = removeDuplicates(inputList1);
        System.out.println("Cписок значений без дубликатов : " + uniqueList);
    }
    }



