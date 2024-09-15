package com.xworkz.Laptop.Internal;

public class InternetProvider extends Provider{
	
	

	public InternetProvider(String name, String ceoName) {
		super(name, ceoName);
		
	}

	@Override
	public void service() {
		System.out.println("running service method in InternrtProvider");
		
	}
	

}
