package com.telran.org.homework_6;

import java.util.ArrayList;
import java.util.List;

public class DublicatRemovalExample {
    public static List<String> removeDuplicates(List<String> inputList1) {
        List<String> result = new ArrayList<>();

        for (String value : inputList1) {
            if (!result.contains(value)) {
                result.add(value);
            }
        }

        return result;
    }
}
