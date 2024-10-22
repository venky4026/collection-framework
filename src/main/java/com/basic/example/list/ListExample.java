package com.basic.example.list;

import java.util.ArrayList;
import java.util.List;

public class ListExample {
    public static void main(String[] args) {
    	
        // Creating a List of Strings
        List<String> list = new ArrayList<>();

        // Adding elements to the List
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");
        list.add("Banana1");
        list.add("Cherry2");
        list.add("Banana");
        list.add("Cherry");
        // Displaying the List
        System.out.println("List elements: " + list);

        // Accessing elements by index
        System.out.println("Element at index 1: " + list.get(0));

        // Removing an element
        list.remove(2);

        // Displaying the updated List
        System.out.println("Updated List elements: " + list);
    }
}
