package com.excercises.java8.streams;

import java.util.ArrayList;
import java.util.List;

public class IntermediateOperations {

	public static void main(String[] args) {
		List<String> memberNames = new ArrayList<>();
		memberNames.add("Aman");
		memberNames.add("Shewit");
		memberNames.add("Aman");
		memberNames.add("Raul");
		memberNames.add("Solomon");
		memberNames.add("Selam");
		memberNames.add("Yonas");
		memberNames.add("Lauren");
		
		System.out.println("=============================");
		// filter()
		memberNames.stream().filter((s) -> s.startsWith("A"))
        .forEach(System.out::println);
		System.out.println("=============================");
		//map
		memberNames.stream().filter((s) -> s.startsWith("A"))
        .map(String::toUpperCase)
        .forEach(System.out::println);
		System.out.println("=============================");
		//sorted
		memberNames.stream().sorted()
        .map(String::toUpperCase)
        .forEach(System.out::println);
		
	}

}
