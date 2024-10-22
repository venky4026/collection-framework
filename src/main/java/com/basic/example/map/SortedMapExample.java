package com.basic.example.map;

import java.util.SortedMap;
import java.util.TreeMap;

public class SortedMapExample {
    public static void main(String[] args) {
        SortedMap<String, Integer> sortedMap = new TreeMap<>();
        sortedMap.put("C", 3);
        sortedMap.put("B", 2);
        sortedMap.put("C", 3);
        sortedMap.put("D", 4);
        sortedMap.put("A", 1);
        sortedMap.put("E", 5);
        sortedMap.put("a", 6);
        sortedMap.put("b", 7);
        System.out.println("First Key: " + sortedMap.firstKey());
        System.out.println("Last Key: " + sortedMap.lastKey());
        
        System.out.println("sortedMap: " + sortedMap);

    }
}
