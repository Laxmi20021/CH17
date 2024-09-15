package com.xworkz.Laptop.Internal;


public class AirtelInternetProvider extends InternetProvider{
	
	
	public AirtelInternetProvider(String name, String ceoName) {
		super(name, ceoName);

	}
@Override
	public void service() {
		System.out.println("running service method in AirtelInternetProvider ");
	}

}
