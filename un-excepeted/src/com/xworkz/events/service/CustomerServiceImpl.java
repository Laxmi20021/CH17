package com.xworkz.events.service;

import com.xworkz.events.exception.InvalidAgeException;
import com.xworkz.events.exception.InvalidNameException;

//
public class CustomerServiceImpl {
	
	String repository;
	
	
	public CustomerServiceImpl() throws ClassNotFoundException {
		if(repository==null) {
			
		
		throw new ClassNotFoundException();
		}
	}
	
	public void save(String name)throws InvalidNameException //Exception or InvalidNameException
	{
		//name:"Narendra Modi: or null or ""
		
		System.out.println("running save in CustomerServiceImpl");
		
		if(name == null  || name.equals(""))
		{
			//stop the execution
			System.out.println("invalid data, will stop the execution");
			throw new InvalidNameException(); //error
		}
		//contiune execution
		System.out.println("valid data, will continue the execution");
	}
	
	public void checkAge(int Age)
	{
		if(Age>0 && Age <=150)
		{
			System.out.println("valid Age........");
		}
		else { throw new InvalidAgeException(); //RuntimeException
		
		}
	}

}
