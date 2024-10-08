package com.xworkz.Collections.runner;


import java.util.ArrayList;
import java.util.Collection;
import java.util.stream.Collectors;

public class CollectionRunner {

	public static void main(String[] args) {
		
		
		//Elements
		
		System.out.println("printing Colections of elements");
		
		System.out.println("................................");
		
        Collection<String> collection=new ArrayList<String>();
		
		collection.add("Hydrogen");
		collection.add("Lithium");
		collection.add("Helium");
		collection.add("Beryllium");
		collection.add("Carbon");
		collection.add("Oxygen");
		collection.add("Neon");
		collection.add("Sodium");
		collection.add("Magnesium");
		collection.add("Silicon");
		
		
        collection.forEach((ref)-> System.out.println(ref));
		System.out.println("==============================");
		
        System.out.println("After sorting");
        
        
        System.out.println("+++++++++++++++++++++++++++++++++++");
        
		collection.stream().sorted().collect(Collectors.toList()).forEach(ref->System.out.println(ref));
		System.out.println("collection of Elements end");
        
		
		
		//Prime Minister

        System.out.println("printing collections of Prime Minister");
        System.out.println("................................");
         
		Collection<String> collection0=new ArrayList<String>();
		
		collection0.add("Jawaharlal Neharu");
		collection0.add("Gulzarilala Nanda");
		collection0.add("lal Bahadur Shastri");
		collection0.add("Indira Gandhi");
		collection0.add("Morarji desai");
		collection0.add("Charan Singh");
		collection0.add("Rajiv Gandhi");
		collection0.add("Vishwanath Pratap Singh");
		collection0.add("Chandra Shekhar");
		collection0.add("PV narasimha Rao");
		collection0.add("Atal Bihari Vajpayee");
		collection0.add("H D Deve Gowda");
		collection0.add("I K Gujral");
		collection0.add("Manmohan Singh");
		collection0.add("Narendra Modi");
		
		collection0.forEach((ref)-> System.out.println(ref));
		System.out.println("==============================");
		
        System.out.println("After sorting");
        
        
        System.out.println("+++++++++++++++++++++++++++++++++++");
        
        collection0.stream().sorted().collect(Collectors.toList()).forEach(ref->System.out.println(ref));
		System.out.println("collection of Prime minister end");
        
        //States
        
		System.out.println("printing Collection of States");
		System.out.println("................................");
		
		
		Collection<String> collection1=new ArrayList<String>();
		collection1.add("Karnataka");
		collection1.add("Andra Pradesh");
		collection1.add("Arunachala Pradesh");
		collection1.add("Assam");
		collection1.add("Bihar");
		collection1.add("Chhattisgarh");
		collection1.add("Goa");
		collection1.add("Gujarat");
		collection1.add("Hariyan");
		collection1.add("Himachal pradesh");
		collection1.add("Jarkhanda");
		collection1.add("Kerala");
		collection1.add("Madhya Pradesh");
		collection1.add("Maharashtra");
		collection1.add("Manipur");
		collection1.add("Maghalaya");
		collection1.add("Mizoram");
		collection1.add("Nagalanda");
		collection1.add("Odisha");
		collection1.add("Punjab");
		collection1.add("Rajasthan");
		collection1.add("Sikkim");
		collection1.add("Tamil Nadu");
		collection1.add("Telangana");
		collection1.add("Tripura");
		collection1.add("Uttar Pradesh");
		collection1.add("UttaraKhanda");
		collection1.add("West Bengal");
		
		
		collection1.forEach((ref)-> System.out.println(ref));
		System.out.println("==============================");
		
        System.out.println("After sorting");
        
        
        System.out.println("+++++++++++++++++++++++++++++++++++");
        
		collection1.stream().sorted().collect(Collectors.toList()).forEach(ref->System.out.println(ref));
		System.out.println("collection of States end");
        
		
		
	}

}
