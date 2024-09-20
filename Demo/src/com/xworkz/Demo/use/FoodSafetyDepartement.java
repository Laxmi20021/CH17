package com.xworkz.Demo.use;

import com.xworkz.Demo.media.HotelRule;

public class FoodSafetyDepartement {
	
	private HotelRule hotelRule;
	
	public void setHotelRule(HotelRule hotelRule)
	{
		this.hotelRule=hotelRule;
	}
	
	
	public void inspection()
	{
		System.out.println("running inspection in FoodSafetyDepartement");
		if(hotelRule !=null) {
			System.out.println("hotelRule is not null");
			hotelRule.cleanPremises();
	  }
		
		else
		{
			System.out.println("hotelRule is null..........");
		}
	}	

}
