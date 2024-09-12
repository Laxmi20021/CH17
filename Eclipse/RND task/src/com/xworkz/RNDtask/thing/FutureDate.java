package com.xworkz.RNDtask.thing;

import java.time.LocalDate;

public class FutureDate {

	public static void main(String[] args) {
		
	
		        LocalDate futureDate = LocalDate.now().plusDays(10); // 10 days in the future
		        System.out.println("Future Date: " + futureDate);

	}

}
