package com.basic.example.set;

import java.util.TreeSet;

public class TreeSetExample {
    public static void main(String[] args) {
        TreeSet<String> treeSet = new TreeSet<>();

        // Adding elements to the TreeSet
        treeSet.add("Zen");
        treeSet.add("Apple");
        treeSet.add("Banana");
        treeSet.add("Mango");
        treeSet.add("Banana");
        treeSet.add("1");
        treeSet.add("2");
        treeSet.add("3");
        treeSet.add("4");
        treeSet.add("App");
        treeSet.add("Man");
        treeSet.add("5");
        
        // Displaying the TreeSet
        System.out.println("TreeSet: " + treeSet);
    }
}

