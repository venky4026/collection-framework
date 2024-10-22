package com.basic.example.set;

import java.util.HashSet;

public class HashSetDemo {
    public static void main(String[] args) {
        // Create a HashSet to store strings
        HashSet<String> cars = new HashSet<String>();
        
        // Add elements to the HashSet
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("1");
        cars.add("2");
        cars.add("BMW"); // Duplicate element, will not be added
        
        // Display the HashSet
        System.out.println(cars); // Output: [Volvo, BMW, Ford]
        
        // Check if an element exists
        System.out.println(cars.contains("Mazda")); // Output: false
        
        // Remove an element
        cars.remove("Volvo");
        
        // Display the HashSet again
        System.out.println(cars); // Output: [BMW, Ford]
    }
}

