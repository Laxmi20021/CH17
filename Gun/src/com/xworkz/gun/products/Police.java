package com.xworkz.gun.products;

public class Police {


	public void shoot(Gun gun) {
		if (gun != null) {
			System.out.println("running shoot in police");
			gun.fire();
			gun.display();
		}
		else {
			System.out.println("gun null");
		}
	}

}