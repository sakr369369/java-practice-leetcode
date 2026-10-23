package com.java.A_INTEVER_QUESTION;

import java.util.List;
import java.util.Arrays;
import java.util.stream.Collectors;

public class FilterStringAndIntegerList{
	public static void main(String[] args){
		List<String> list = Arrays.asList("1,pramod,3", "3,Sanvi,5,7","Raj, 9,2,4");
		
		System.out.println(list);
		
		List<Integer> intList = list.stream()
											.flatMap(s -> Arrays.stream(s.split(",")))
											.filter(s -> s.matches("\\d+"))
											.map(Integer :: parseInt)
											.collect(Collectors.toList());
		
		System.out.println(intList);
		
			List<String> intList2 = list.stream()
											.flatMap(s -> Arrays.stream(s.split(",")))
											.filter(s -> s.matches("\\d+"))
											.collect(Collectors.toList());
		
		System.out.println(intList2);
	}
}