package com.basic.example.map;

import java.util.LinkedHashMap;

public class LinkedHashMapExample {
	public static void main(String[] args) {
		// Create a LinkedHashMap
		LinkedHashMap<String, Integer> linkedHashMap = new LinkedHashMap<>();

		// Add elements to the LinkedHashMap
		linkedHashMap.put("One", 1);
		linkedHashMap.put("Two", 2);
		linkedHashMap.put("Five", 5);
		linkedHashMap.put("Three", 3);
		linkedHashMap.put("Four", 4);
		linkedHashMap.put("Six", 6);
		linkedHashMap.put("seven", null);
		linkedHashMap.put("nine", null);
		linkedHashMap.put(null, null);


		// Display the LinkedHashMap
		System.out.println("LinkedHashMap:following the order" + linkedHashMap);
	}
}
