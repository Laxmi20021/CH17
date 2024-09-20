package com.xworkz.Demo.runner;

import com.xworkz.Demo.impl.CanaraHotelRuleimpl;
import com.xworkz.Demo.impl.KACricketRuleImpl;
import com.xworkz.Demo.media.CricketRule;
import com.xworkz.Demo.media.HotelRule;
import com.xworkz.Demo.use.BCCI;
import com.xworkz.Demo.use.FoodSafetyDepartement;

public class HotelRunner {

	public static void main(String[] args) {

		
		HotelRule hotelRule=new CanaraHotelRuleimpl();
		
		FoodSafetyDepartement foodSafetyDepartement=new FoodSafetyDepartement();
		
		foodSafetyDepartement.inspection();
		foodSafetyDepartement.setHotelRule(hotelRule);
		
  
	}

}



