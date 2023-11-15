package com.telran.org.homework_8;

import java.util.Arrays;
import java.util.Comparator;

public class ArrayOfPairs {
    public static void main(String[] args) {
        String[][] arrayOfPairs = {{"abc", "last"}, {"pklz", "yelp"}, {"rpng", "note"}, {"ppza", "xyz"}};

        Arrays.sort(arrayOfPairs, Comparator.comparing((String[] pair) -> pair[0])
                .thenComparing(pair -> pair[1]));

        for (String[] pair : arrayOfPairs) {
            System.out.print(Arrays.toString(pair));
        }
    }
}
