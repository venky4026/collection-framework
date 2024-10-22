package com.basic.example.list;

import java.util.Vector;

public class VectorExample {
    public static void main(String[] args) {
        Vector<String> vector = new Vector<>();
        vector.add("A");
        vector.add("C");
        vector.add("B");

        for (String element : vector) {
            System.out.println(element);
        }
    }
}
