package com.xworkz.gun.products;

public class Idol {


	
	public void wear(Saree saree) {
		if(saree!=null) {
			System.out.println("running wear in idol");
			saree.enhanceLook();
			saree.print();
		}
		
	}

}