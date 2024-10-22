package com.basic.example.map;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapExample {
    public static void main(String[] args) {
        // Creating a TreeMap of Strings (keys) and Integers (values)
        Map<String, Integer> treeMap = new TreeMap<>();

        // Adding elements to the TreeMap
        treeMap.put("Banana", 2);
        treeMap.put("Apple", 1);
        treeMap.put("Cherry", 3);
        treeMap.put("Four", 4);
        treeMap.put("Five", 5);
        treeMap.put("Six", 6);
        treeMap.put("1", 7);
        treeMap.put("2", 8);
        treeMap.put("11", null);
        
       

        // Displaying the TreeMap
        System.out.println("TreeMap elements: " + treeMap);

        // Getting a value from the TreeMap
        int value = treeMap.get("Cherry");
        System.out.println("Before Value of Cherry: " + value);
        
        treeMap.put("Cherry", 9);
        int value1 = treeMap.get("Cherry");
        System.out.println("After Replacement Value of Cherry: " + value1);
        treeMap.put(null, 9);
        // Removing an element from the TreeMap
        treeMap.remove("Banana");

    }
}
