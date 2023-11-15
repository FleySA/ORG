package com.telran.org.homework_6;

import java.util.ArrayList;
import java.util.List;
public class StringSpiski {
    public static List<Integer> getLengths(List<String> inputList) {
        List<Integer> result = new ArrayList<>();
        for (String str : inputList) {
            int length = str.length();
            result.add(length);
        }
        return result;
    }



}

