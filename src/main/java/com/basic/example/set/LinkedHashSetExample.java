package com.basic.example.set;

import java.util.LinkedHashSet;

public class LinkedHashSetExample {
	public static void main(String[] args) {
		LinkedHashSet<String> linkedSet = new LinkedHashSet<>();

		// Adding elements to the LinkedHashSet
		linkedSet.add("A");
		linkedSet.add("B");
		linkedSet.add("C");
		linkedSet.add("D");
		linkedSet.add("A"); // Duplicate element, will not be added

		// Displaying the LinkedHashSet
		System.out.println("LinkedHashSet elements: " + linkedSet);
	}
}
