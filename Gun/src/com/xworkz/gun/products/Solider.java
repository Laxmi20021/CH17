package com.xworkz.gun.products;

public class Solider {



	public void trigger() {
		System.out.println("running trigger in solider");
		Gun gun = new Gun("AK-47", "India", "riffle");
		gun.display();
	}

}