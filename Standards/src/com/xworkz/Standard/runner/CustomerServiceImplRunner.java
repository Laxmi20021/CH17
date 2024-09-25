package com.xworkz.Standard.runner;

import com.xworkz.Standard.internal.Printer;
import com.xworkz.Standard.internal.Staff;
import com.xworkz.Standard.repository.CustomerRepository;
import com.xworkz.Standard.repository.CustomerRepositoryimpl;
import com.xworkz.Standard.service.CustomerServiceImpl;


public class CustomerServiceImplRunner {

	public static void main(String[] args) {

		CustomerRepository customerRepository=new CustomerRepositoryimpl();
		customerRepository.save();
		System.out.println("running in CustomerServiceImplRunner");
		
		Printer printer=new Printer();
		printer.getBrand();
		System.out.println("printer running in CustomerServiceImplRunner");
		
		Staff staff=new Staff();
		staff.getPrinter();
		System.out.println("getPrinter running in CustomerServiceImplRunner");
		
		
		staff.takePrintOut();
		System.out.println("takePrintOut running in CustomerServiceImplRunner");
		
		CustomerServiceImpl CustomerServiceImpl=new CustomerServiceImpl(customerRepository);
		CustomerServiceImpl.run();
		System.out.println("");
		
		
		CustomerRepositoryimpl customerRepositoryimpl=new CustomerRepositoryimpl();
		customerRepositoryimpl.save();
		
		
	}

}
