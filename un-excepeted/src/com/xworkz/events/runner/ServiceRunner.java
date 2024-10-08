package com.xworkz.events.runner;

import com.xworkz.events.exception.InvalidEmailException;
import com.xworkz.events.service.ServiceImpl;

public class ServiceRunner {

	public static void main(String[] args) throws InvalidEmailException {
		
		
		System.out.println("running main in ServiceRunner");
		
		System.out.println("======================");
		
		System.out.println("running before email");
		ServiceImpl serviceImpl=new ServiceImpl();
		serviceImpl.save("patil@gmail.com");
		System.out.println("running after email");
		
		
		
		System.out.println("------------------------");
		
		System.out.println("running main ServiceRunner");
		System.out.println("running before price");
		serviceImpl.acceptPrice(40);
		serviceImpl.acceptPrice(200);
		System.out.println("runnnin after price");
		
		

		
	}

}
