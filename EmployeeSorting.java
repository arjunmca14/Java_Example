package com.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class EmployeeSorting {
	public static void main(String[] args) {
		//by using Custom sorting using Employee

		List<Employee> employeelist=EmployeeList();
		List<Employee> sortingEmployeeByusingId = employeelist.stream()
				.sorted(Comparator.comparingInt(Employee::getId))
				.collect(Collectors.toList());
		System.out.println(sortingEmployeeByusingId);

		List<Employee> reverseEmployeeListByUsingId = employeelist.stream()
				.sorted(Comparator.comparingInt(Employee::getId).reversed())
				.collect(Collectors.toList());
		System.out.println(reverseEmployeeListByUsingId);


		//we need to compare names and ID both
		List<Employee> sortingUsingIdwithNames = employeelist.stream()
				.sorted((o1, o2) -> {
					if(o1.getId() == o2.getId())
						return o1.getName().compareTo(o2.getName());
					else if(o1.getId() > o2.getId())
						return 1;
					else return -1;
				})
				.collect(Collectors.toList());

		sortingUsingIdwithNames.forEach(System.out::println);

	}


	public static List<Employee> EmployeeList()
	{
		List<Employee> list=new ArrayList<>();
		list.add(new Employee(101, "Arjun", 10000, "hyderabad"));
		list.add(new Employee(121, "Rakesh", 12000, "Secendrabad"));
		list.add(new Employee(121, "Ganesh", 12000, "Secendrabad"));
		list.add(new Employee(131, "Raju", 13000, "Vijayawada"));
		list.add(new Employee(111, "Kiran", 11000, "bhihaar"));
		list.add(new Employee(103, "Fani", 14000, "karnataka"));
		list.add(new Employee(113, "Ganesh", 16000, "chennai"));
		list.add(new Employee(123, "Syam", 11300, "bangalore"));
		list.add(new Employee(133, "Suresh", 12100, "pune"));

		return list;
	}

}
