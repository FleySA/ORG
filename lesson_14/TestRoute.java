package com.telran.org.lesson_14;

import java.util.HashMap;
import java.util.Map;

public class TestRoute {

    public static void main(String[] args) {
        Map<String, String> cityMap = new HashMap<>();
        cityMap.put("Berlin", "London");
        cityMap.put("Tokyo", "Seoul");
        cityMap.put("Mumbai", "Berlin");
        cityMap.put("Seoul", "Mumbai");
        cityMap.put("London", "Helsinki");

        //T - > S -> M -> B -> L -> H

        printRoute(cityMap);
    }

    private static void printRoute(Map<String, String> map) {
        Map<String, String> reverseMap = new HashMap<>();
        for (Map.Entry<String, String> pair : map.entrySet()) {
            reverseMap.put(pair.getValue(), pair.getKey());
        }

        String start = null;
        for (Map.Entry<String, String> pair : map.entrySet()) {
            if (!reverseMap.containsKey(pair.getKey())) {
                start = pair.getKey();
                break;
            }
        }

        System.out.println("Start route " + start);

    }
}