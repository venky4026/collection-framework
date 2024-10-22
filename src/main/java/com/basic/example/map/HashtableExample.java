package com.basic.example.map;

import java.util.Hashtable;

public class HashtableExample {
    public static void main(String[] args) {
        // Create a Hashtable of String keys and Integer values
        Hashtable<String, Integer> hashtable = new Hashtable<>();

        // Adding elements to the Hashtable
        hashtable.put("One", 1);
        hashtable.put("Two", 2);
        hashtable.put("Three", 3);
        hashtable.put("One", 41);
        hashtable.put("Four", 4);
        System.out.println("Before null Hashtable Elements: " + hashtable);
        
        System.out.println("After null Hashtable Elements !");
        hashtable.put(null, 5);
        // Displaying the Hashtable elements
        System.out.println("Hashtable Elements: " + hashtable);
    }
}
