package com.xworkz.gun.products;

public class Tailor {


	
	public Saree stitch() {
		Saree saree=new Saree("silk", 20000, "pink");
		saree.enhanceLook();
		saree.print();
		return saree;
	}

}