package com.telran.org.lessonsix;



import com.telran.org.lessonsix.hwr.CreditCard;
import com.telran.org.lessonsix.hwr.Currency;

import java.util.ArrayList;
import java.util.List;

public class ArrayListApp {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(2);  // add - add element to the end of the list
        list.add(3);
        list.add(5);
        list.add(10);
        list.add(1, 6);  // insert element to certain index
        System.out.println(list);
        System.out.println("Size of list = " + list.size()); // size() - real size of list
        System.out.println(list.get(1));  //  get(int index) - get element by index

        for (int i = 0; i < list.size(); i++) {
            System.out.println("Element on index " + i + " = " + list.get(i));
        }

        for (Integer element : list) {
            System.out.println("Element = " + element);
        }

        list.remove(1); // delete element by index
        list.remove(Integer.valueOf(5)); // delete object


        System.out.println(list);


        List<String> stringList = new ArrayList<>();
        stringList.add("Hello");
        stringList.add("World");
        System.out.println(stringList);
        stringList.remove("Hello");
        System.out.println(stringList);

//        CreditCard cardOne = new CreditCard(1000);
//        CreditCard cardTwo = new CreditCard(2000);

        List<CreditCard> creditCardList = new ArrayList<>();
        creditCardList.add(new CreditCard(1000, Currency.EUR));
        creditCardList.add(new CreditCard(2000, Currency.EUR));
        System.out.println(creditCardList);

//        List<CreditCard> creditCards = List.of(new CreditCard(1000),
//                new CreditCard(2000));
//        System.out.println(creditCards);


    }
}