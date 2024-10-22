package com.basic.example.set;

import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetExample {
    public static void main(String[] args) {
        SortedSet<String> sortedSet = new TreeSet<>();
        sortedSet.add("India");
        sortedSet.add("Australia");
        sortedSet.add("South Africa");
        sortedSet.add("India");
        System.out.println("SortedSet elements: " + sortedSet);

        sortedSet.remove("Australia");
        System.out.println("Set after removing Australia: " + sortedSet);
        System.out.println("Set after removing Australia using last method: " + sortedSet.last());
        System.out.println("Set after removing Australia using first method: " + sortedSet.first());

    }
}

