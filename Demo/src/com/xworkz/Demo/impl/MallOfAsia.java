package com.xworkz.Demo.impl;

import com.xworkz.Demo.media.MallRules;

public class MallOfAsia implements MallRules{

	@Override
	public boolean validId() {
		
		System.out.println("running validId in MallOfAsia");
		return false;
	}

}
