package com.basic.example.map;

import java.util.HashMap;

public class HashMapExample {
    public static void main(String[] args) {
        // Create a HashMap
        HashMap<String, Integer> map = new HashMap<>();

        // Add key-value pairs to the HashMap
        map.put("Apple", 10);
        map.put("Banana", 20);
        map.put("Orange", 30);
        map.put("Mango", 10);
        map.put("Lemon", 20);
        map.put("X", 30);

        // Access a value using its key
        System.out.println("Value for key 'Apple': " + map.get("Apple"));

        // Print all key-value pairs
        System.out.println("HashMap: " + map);
    }
}

