package com.basic.example;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IterableExample {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");

        // Using enhanced for-loop
        for (String fruit : list) {
            System.out.println("Using enhanced for-loop"+fruit);
        }

        // Using Iterator
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println("Using Iterator"+iterator.next());
        }
    }
}

