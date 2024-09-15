package com.xworkz.Laptop.Internal;



public class MovieBookingProvider extends BookingProvider{




	public MovieBookingProvider(String name, String ceoName) {
		super(name, ceoName);
		
	}

public void book(){
	System.out.println("running book method in MovieBookingProvider");
}
public void  cancel() {
	System.out.println("running cancel method in MovieBookingProvider");
}

public void service() {
	System.out.println("running service method in MovieBookingProvider");
}

}
