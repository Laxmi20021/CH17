package com.xworkz.events.service;

//Stack Treace program

public class EventStack {
	
	public void method1()
	{
		System.out.println("method1");
		method2();
		System.out.println("method2 completed");
	}
	
	
	public void method2()
	{
		System.out.println("method2");
		method3();
		System.out.println("method3 completed");

	}
	
	
	public void method3()
	{
		System.out.println("method3");
		try {
			method4();
		}
		catch(Exception e) {
			System.err.println("exception in method4");
		}
		method4();
		System.out.println("method4 completed");

	}
	
	public void method4()
	{
		System.out.println("method4");
		if(true)
		{
			throw new IllegalArgumentException();
		}
		
		//String name=null; name.toString();
		
		method5();
		System.out.println("method5 completed");

	}
	
	public void method5()
	{
		System.out.println("method5");
		method6();
		System.out.println("method6 completed");

	}
	
	public void method6()
	{
		System.out.println("method6");
		System.out.println("method1 completed");

	}
	
	
}
