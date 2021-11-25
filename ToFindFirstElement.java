package com.java8;
import java.util.*;
import java.util.stream.*;
public class ToFindFirstElement {
    public static void main(String args[]) {
            List<Integer> myList = Arrays.asList(10,15,8,49,25,98,98,32,15);
            myList.stream()
                  .findFirst()
                  .ifPresent(System.out::println);
    }
}
