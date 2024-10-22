package com.basic.example.list;

import java.util.LinkedList;

public class LinkedListDemo {
	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<>();
		list.add("Venkat");
		list.add("Java");
		list.add("1");
		list.add("2");
		list.add("Software1");
		list.add("Java");
		list.add("Software3");
		System.out.println("Output Response :" + list);
		
		 // Accessing elements
        System.out.println("First Venkat: " + list.get(0));
	}

}
