package com.xworkz.Standard.service;

import com.xworkz.Standard.repository.CustomerRepository;

public class CustomerServiceImpl {
	
	private CustomerRepository customerRepository;
	
	public CustomerServiceImpl(CustomerRepository customerRepository)
	{
		System.out.println("running in CustomerServiceImpl");
		this.customerRepository=customerRepository;
	}
	
	public void run()
	{
		if(customerRepository!=null)
		{
			customerRepository.save();
		}
	}

}
