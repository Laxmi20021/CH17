package com.xworkz.Standard.internal;

public class Staff {
	
	Printer printer=new Printer();
	
	public Printer getPrinter()
	{
		System.out.println("running in Staff");
		return this.printer;
	}
	
	public void takePrintOut()
	{
		System.out.println("printer.getBrand"); 
		//print HP
		//printer.setBrand("DELL");
		
	}

}
