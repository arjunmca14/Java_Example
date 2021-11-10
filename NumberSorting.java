package com.java8;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class NumberSorting {
	public static void main(String[] args) {
		//		only numbers sorting and descending order
		List<Integer> listofNumbers = Arrays.asList(10, 23, -4, 0, 18);
		//ascending order
		List<Integer> sortedListForNumbers = listofNumbers.stream().sorted().collect(Collectors.toList());
		System.out.println(sortedListForNumbers);


		//Descending order
		List<Integer> descSortingNumbers = listofNumbers.stream()
				.sorted(Collections.reverseOrder())
				.collect(Collectors.toList());

		System.out.println(descSortingNumbers);

	}
}