package com.basic.example.set;

import java.util.HashSet;
import java.util.Set;

public class SetExample {
	public static void main(String[] args) {
		Set<String> set = new HashSet<>();
		set.add("Apple");
		set.add("Banana");
		set.add("Rocket");
		set.add("1");
		set.add("5");
		set.add("6");
		set.add("5");// Duplicate will not be added
		// output with Array format
		System.out.println("Set Elements: " + set);
		// output with Loop format
		for (String loopSet : set) {
			System.out.println("Set Elements with loop: " + loopSet);
		}
	}
}
