package com.xworkz.events.runner;

import com.xworkz.events.service.CustomerServiceImpl;
import com.xworkz.events.service.EventStack;

public class EventRunner {

	public static void main(String[] args) throws ClassNotFoundException {

		
		
		EventStack eventStack =new EventStack();
		eventStack.method1();  //terminate the program
		//--->method2--->method3--->method4--->method5--->method6
		System.out.println("method1 completed");
		
		CustomerServiceImpl customerServiceImpl=new CustomerServiceImpl();
		
	}

}
