package com.excercises.java8.streams;

import java.util.ArrayList;
import java.util.List;

public class TerminalOperations {
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
		
		//forEach
		memberNames.forEach(System.out::println);
		
	}

}
