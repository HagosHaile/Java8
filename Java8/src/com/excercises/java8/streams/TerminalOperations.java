package com.excercises.java8.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class TerminalOperations {
	public static void main(String[] args) {
		
		/*=============Short-circuit operations======================
				A) anyMatch()
				B) findFirst()
		*/
		
		List<String> memberNames = new ArrayList<>();
		memberNames.add("Aman");
		memberNames.add("Shewit");
		memberNames.add("Aman");
		memberNames.add("Raul");
		memberNames.add("Solomon");
		memberNames.add("Selam");
		memberNames.add("Yonas");
		memberNames.add("Lauren");
		
		//forEach
		memberNames.forEach(System.out::println);
		
		//collect 
		System.out.println("=================================================================");
		List<String> memNamesInUppercase = memberNames.stream().sorted()
                .map(String::toUpperCase)
                .collect(Collectors.toList());
		System.out.print(memNamesInUppercase);
		System.out.println("\n====================match=============================================");
		
		//match()
		boolean matchedResult = memberNames.stream()
                .anyMatch((s) -> s.startsWith("A"));

		System.out.println(matchedResult);

		matchedResult = memberNames.stream()
                .allMatch((s) -> s.startsWith("A"));

		System.out.println(matchedResult);

		matchedResult = memberNames.stream()
                .noneMatch((s) -> s.startsWith("A"));

		System.out.println(matchedResult);
		
		System.out.println("\n====================== count===========================================");
		//count
		long totalMatched = memberNames.stream()
                .filter((s) -> s.startsWith("A"))
                .count();

		System.out.println(totalMatched);
		
		System.out.println("\n=============================reduce====================================");
		//reduce
		Optional<String> reduced = memberNames.stream()
                .reduce((s1,s2) -> s1 + "#" + s2);

		reduced.ifPresent(System.out::println);
		System.out.println("\n=================================================================");
		
	}

}
