package com.xworkz.events.service;

import com.xworkz.events.exception.InvalidNameException;

public class CustomerServiceImpl {
	
	public void save(String name)throws InvalidNameException
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
		System.out.println("valid data, will contune the execution");
	}

}
