package com.xworkz.Demo.impl;

import com.xworkz.Demo.media.HotelRule;

public class CanaraHotelRuleimpl implements HotelRule{
	
	@Override
	public boolean cleanPremises() {
		
		System.out.println("cleanPremises in CanaraHotelRuleimpl");
		return false;
	}

}
