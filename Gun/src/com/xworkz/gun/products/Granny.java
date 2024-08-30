package com.xworkz.gun.products;

public class Granny {


	private Saree saree = new Saree("Banarasi", 7000, "blue");

	public void fold() {
		if(saree!=null) {
		System.out.println("running fold in saree");
		saree.enhanceLook();
		saree.print();
		}
		else {
			System.out.println("saree is null");
		}
	}

}