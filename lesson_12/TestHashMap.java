package com.telran.org.lesson_12;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;


public class TestHashMap {

    public static void main(String[] args) {


        Map<String, Integer> map = new HashMap<>();
        // hello -> 5
        // world -> 15
        // again -> 30
        // hi -> 10
        // next -> 15
        map.put("hello", 5);
        map.put("world", 15);
        map.put("again", 30);
        map.put("hi", 10);
        map.put("next", 15);


        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            String key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println("Pair : key = " + key + ", value = " + value);
        }

    }

    private static void printMapVersionTwo(Map<String, Integer> map) {
        map.forEach((k,v) -> {
            System.out.println("Pair : key = " + k + ", value =" + v);
        });
    }


}
