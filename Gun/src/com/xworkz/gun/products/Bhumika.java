package com.xworkz.gun.products;

public class Bhumika {


	
	public WashingMachine use() {
		System.out.println("running use in Bhumika");
		WashingMachine washingMachine=new WashingMachine("IFB", "topLoad", 8);
		washingMachine.show();
		return washingMachine;
	}

}