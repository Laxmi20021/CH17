package com.xworkz.Collections.runner;

import java.util.ArrayList;
import java.util.Collection;
import java.util.stream.Collectors;

public class StreamRunner2 {

	public static void main(String[] args) {

		
		
		Collection<Integer> collection =new ArrayList<Integer>();
		
		collection.add(100);
		collection.add(90);
		collection.add(300);
		collection.add(455);
		collection.add(60);
		
		collection.forEach((ref)-> System.out.println(ref));
		
		System.out.println("After sorting");
		collection.stream().sorted().collect(Collectors.toList()).forEach(ref->System.out.println(ref));
		
		
		collection.stream().sorted((ref1,ref2)->{
			if(ref1>ref2) return 1;
			if(ref1<ref2) return -1;
			return 0;
		})
		.collect(Collectors.toList()).forEach(ref->System.out.println(ref));
		
		
		Collection<String> collection1=new ArrayList<String>();
		collection1.add("kali");
		collection1.add("yamuna");
		collection1.add("kavari");
		collection1.add("ganga");
		collection1.add("godavari");
		collection1.add("TB");
		collection1.add("Krishna");
		
		collection1.stream().sorted().collect(Collectors.toList()).forEach(ref->System.out.println(ref));
		
		
		
	}

}
