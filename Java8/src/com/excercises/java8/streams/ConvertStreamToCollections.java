package com.excercises.java8.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ConvertStreamToCollections {
	
	public static void main(String[] args){
		//Convert Stream to array using stream.toArray(EntryType[]::new)
        List<Integer> list = new ArrayList<Integer>();
        for(int i = 1; i< 10; i++){
            list.add(i);
        }
        Stream<Integer> stream = list.stream();
        Integer[] evenNumbersArr = stream.filter(i -> i%2 == 0).toArray(Integer[]::new);
        for(int i =0; i< evenNumbersArr.length; ++i) {
        System.out.print(evenNumbersArr[i]);
        }
        
        System.out.println("\n");
        //Convert Stream to List using stream.collect(Collectors.toList())
        Stream<Integer> stream1 = list.stream();
        List<Integer> evenNumbersList = stream1.filter(i -> i%2 == 0).collect(Collectors.toList());
        for(int i =0; i< evenNumbersList.size(); ++i) {
            System.out.print(evenNumbersList.get(i));
            }
            
        
    }

}
