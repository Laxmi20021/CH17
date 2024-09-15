package com.xworkz.Laptop.Internal;



public class JioAirtelInternetProvider extends InternetProvider{
	
	
	public JioAirtelInternetProvider(String name, String ceoName) {
		super(name, ceoName);
		
	}

	public void service() {
		System.out.println("running service method in JioInternetProvider");
	}
	


}
