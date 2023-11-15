package com.telran.org.homework_6;

import java.util.ArrayList;
import java.util.List;

public class IntSpiski {


    public static List<Integer> doubleValues(List<Integer> inputList){
        List<Integer> result = new ArrayList<>();
        for (Integer value : inputList){
            result.add(value*2);

        }
        return result;
    }



}

