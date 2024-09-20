package com.xworkz.Demo.impl;

import com.xworkz.Demo.media.RoadContract;

public class RahulRoadContractImpl implements RoadContract {

	@Override
	public boolean completeWork() {
		System.out.println("running completework in RahulRoadContractImpl");
		return false;
	}

}
