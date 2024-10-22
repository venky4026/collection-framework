package com.basic.example.map;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapExample {
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();
		map.put("Apple", 1);
		map.put("Banana", 2);
		map.put("Cherry", 3);
		map.put("Orange", 4);
		System.out.println("Map elements with HashMap order: " + map);

		Map<String, Integer> treeMap = new TreeMap<>();
		treeMap.put("Apple", 1);
		treeMap.put("Banana", 2);
		treeMap.put("Cherry", 3);
		treeMap.put("Orange", 4);
		System.out.println("Map elements with treeMap order: " + treeMap);
	}
}
