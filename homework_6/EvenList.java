package com.telran.org.homework_6;

import java.util.ArrayList;
import java.util.List;

public class EvenList {
    public static List<Integer> numbers(List<Integer> inputList) {
        List<Integer> result = new ArrayList<>();
        for (Integer number : inputList) {
            if (number % 2 != 0) {
                result.add(number);
            }
        }
        return result;
    }
}
