package com.xworkz.RNDtask.runner;

import com.xworkz.RNDtask.thing.Person;

public class PersonRunner {

	public static void main(String[] args) {

		
		
		
		Person person1 = new Person("Laxmi", "laxmi@example.com", 21, "99721567890");
        Person person2 = new Person("yashoda", "yashu@example.com", 25, "9876543210");
        Person person3 = new Person("rohit", "rohi@example.com", 45, "6363234567");
        Person person4 = new Person("rakshit", "rak@example.com", 19, "7890123456");
        Person person5 = new Person("virupakshagouda", "veeru@example.com", 60, "99722213579");

        
        Person[] persons = {person1, person2, person3, person4, person5};

        
        for (Person person : persons) {
            System.out.println(person.toString());
        }
    }
		
		
		
}
		
		
		
		
		
		
	