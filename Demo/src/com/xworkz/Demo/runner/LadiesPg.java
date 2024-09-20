package com.xworkz.Demo.runner;

import com.xworkz.Demo.media.PGRule;

public class LadiesPg implements PGRule{

	@Override
	public double costPerMonth() {
		System.out.println("costPerMonth running in LadiesPg");
		return 5000;
	}

	@Override
	public boolean wifi() {
		System.out.println("wifi running in LadiesPg");
		return true;
	}

}
