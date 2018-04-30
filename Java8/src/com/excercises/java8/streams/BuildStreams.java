package com.excercises.java8.streams;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class BuildStreams {

	public static void main(String[] args) {

		System.out.println("=============================================================================");
		// 1) Using Stream.of(val1, val2, val3….)
		Stream<Integer> stream = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9);
		stream.forEach(p -> System.out.print(p));

		System.out.println("\n=============================================================================");
		// 2) Using Stream.of(arrayOfElements)
		Stream<Integer> stream1 = Stream.of(new Integer[] { 1, 2, 3, 4, 5, 6, 7, 8, 9 });
		stream1.forEach(System.out::print);
		System.out.println("\n=============================================================================");
		// 3) Using someList.stream()
		List<Integer> list = new ArrayList<Integer>();
		for (int i = 1; i < 10; i++) {
			list.add(i);
		}
		Stream<Integer> stream2 = list.stream();
		stream2.forEach(p -> System.out.print(p + " "));

		System.out.println("\n=============================================================================");
		// 4) Using String chars or String tokens
		IntStream stream4 = "12345_abcdefg".chars();
		stream4.forEach(p -> System.out.print(p + " "));

		// OR

		Stream<String> stream5 = Stream.of("A$B$C".split("\\$"));
		stream5.forEach(p -> System.out.print(p + " "));

		/*System.out.println("\n=============================================================================");
		// 5) Using Stream.generate() or Stream.iterate() functions
		Stream<Date> stream3 = Stream.generate(() -> {
			return new Date();
		});
		stream3.forEach(p -> System.out.println(p));

		System.out.println("\n=============================================================================");
		 */
	}

}
