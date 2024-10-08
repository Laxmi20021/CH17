package com.xworkz.events.service;


import com.xworkz.events.exception.InvalidAmountException;
import com.xworkz.events.exception.InvalidEmailException;


public class ServiceImpl{
	
	
		public void save(String Email) throws InvalidEmailException {
			System.out.println("running save in InvalidEmailException");
	        if (Email == null || !Email.contains("@") || !Email.contains(".com")) {
	            throw new InvalidEmailException();
	        }
	        
	        System.out.println("Email saved successfully: " + Email);
	    }
	
	
	public void acceptPrice(int Price)
	{
		if(Price>0 && Price <=100)
		{
			System.out.println("valid Price........");
		}
		else { throw new InvalidAmountException(); //RuntimeException
		
		}
		System.out.println("Price saved successfully: " + Price);
	}

}
