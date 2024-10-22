package com.basic.example.list;

import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {
        // Creating an ArrayList to store String elements
        ArrayList<String> cars = new ArrayList<String>();

        // Adding elements to the ArrayList
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
        cars.add("Mazda");
        cars.add("1");
        cars.add("App");
        // Accessing elements
        System.out.println("First car: " + cars.get(0));

        // Modifying elements
        cars.set(0, "Opel");
        System.out.println("First car: " + cars);

    }
}
