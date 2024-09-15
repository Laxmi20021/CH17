package com.xworkz.Laptop.Internal;



public class ExtrmeAirtelInternetProvider extends AirtelInternetProvider{
	
	
	public ExtrmeAirtelInternetProvider(String name, String ceoName) {
		super(name, ceoName);
		
	}

	

	public void service() {
		System.out.println("running service method in ExtremeAirtelInternetProvider");
	}

}
