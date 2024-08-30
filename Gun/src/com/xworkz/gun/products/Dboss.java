package com.xworkz.gun.products;

public class Dboss {


	private Gun gun;

	public Dboss(Gun gun) {
		super();
		this.gun = gun;
	}

	public void use() {
		if (gun != null) {
			System.out.println("running use in dboss");
			gun.fire();
			gun.display();

		} else {
			System.out.println("gun is null");
		}
	}

}