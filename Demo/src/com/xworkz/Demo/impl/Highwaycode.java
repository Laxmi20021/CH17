package com.xworkz.Demo.impl;

import com.xworkz.Demo.media.TrafficRule;

public class Highwaycode implements TrafficRule{

	@Override
	public String LincenceNo(String regno) {
		System.out.println("running LincenceNo in Highwaycode");
		return  regno;
	}

}
