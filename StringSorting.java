package com.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StringSorting {
	public static void main(String[] args) {
		
		//by using String to Sorting and descending order
		List<String> listOfString=Arrays.asList("John", "Mark", "Robert", "Lucas", "Brandon");
		listOfString.stream().sorted().forEach(System.out::println);
		List<String> sortingOrderforString = listOfString.stream().sorted().collect(Collectors.toList());
		System.out.println(sortingOrderforString);



		//descending order
		List<String> descendingOrderForString = listOfString.stream()
				.sorted(Collections.reverseOrder())
				.collect(Collectors.toList());

		System.out.println(descendingOrderForString);

		//shortest length of String
		String data=listOfString.stream().sorted((e2, e1) -> e1.length() > e2.length() ? -1 : 1).findFirst().get();;
		System.out.println(">>>><<<"+data);
	}
}
