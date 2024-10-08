package com.xworkz.Collections.runner;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamRunner {

	public static void main(String[] args) {

		
		Collection<Integer>collection=new ArrayList<Integer>();
		collection.add(22);
		collection.add(45);
		collection.add(35);
		collection.add(67);
		collection.add(89);
		//elements:search/filter/sorting/modifying
		
		//Iterator for each loop or foreach methods
		Consumer<Integer> consumer=(ref)-> System.out.println("ref :"+ref);
		
		collection.forEach(consumer); //explicit or implicit
		//or

		//collection.forEach((ref)-> System.out.println(ref));
		
		
		for(Integer ref:collection)
		{
			System.out.println("ref :"+ref);
		}
		
		
		
			System.out.println("After Stream");
		
		
		Stream<Integer> stream=collection.stream();
		
		List<Integer> sortedList=collection.stream().sorted().collect(Collectors.toList());
		
		for(Integer ref:sortedList)
		{
			System.out.println("ref :"+ref);
		}
		






	}

}
