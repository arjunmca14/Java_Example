package com.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
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
		
		
		//sorting using for id and send to map here, key is id and value is name
		
		Map<String,Integer> sortingEmployeeByusingIdSendtoMap = employeelist.stream()
				.sorted(Comparator.comparingInt(Employee::getId))
				.collect(Collectors.toMap(Employee::getName, Employee::getId));
		
		
		System.out.println(sortingEmployeeByusingIdSendtoMap);
		System.out.println();
		System.out.println("Max occurence of data based on value>>>"+Collections.max(sortingEmployeeByusingIdSendtoMap.entrySet(), Map.Entry.comparingByValue()).getKey());
		int maxValueInMap=(Collections.max(sortingEmployeeByusingIdSendtoMap.values()));
		System.out.println();
		for(Map.Entry<String, Integer> entry:sortingEmployeeByusingIdSendtoMap.entrySet())
		{
			if(maxValueInMap ==entry.getValue())
			{
				System.out.println(entry.getValue()+"<<<max occurence key>>>"+entry.getKey());
			}
		}
	}


	public static List<Employee> EmployeeList()
	{
		List<Employee> list=new ArrayList<>();
		list.add(new Employee(101, "Arjun", 10000, "hyderabad",56));
//		list.add(new Employee(121, "Rakesh", 12000, "Secendrabad",67));
		list.add(new Employee(121, "Ganesh", 12000, "Secendrabad",34));
		list.add(new Employee(131, "Raju", 13000, "Vijayawada",36));
		list.add(new Employee(111, "Kiran", 11000, "bhihaar",76));
		list.add(new Employee(103, "Fani", 14000, "karnataka",23));
	//	list.add(new Employee(113, "Ganesh", 16000, "chennai",45));
		list.add(new Employee(123, "Syam", 11300, "bangalore",45));
		list.add(new Employee(133, "Suresh", 12100, "pune",43));

		return list;
	}

}
