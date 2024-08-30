package com.xworkz.gun.runner;

import com.xworkz.gun.products.Granny;
import com.xworkz.gun.products.Idol;
import com.xworkz.gun.products.Lady;
import com.xworkz.gun.products.Saree;
import com.xworkz.gun.products.Tailor;

public class SareeRunner {

	public static void main(String[] args) {
		Lady lady=new Lady();
		lady.wash();
		Idol idol=new Idol();
		Saree saree=new Saree("Bandini", 4000, "white");
		idol.wear(saree);
		Granny granny =new Granny();
		granny.fold();
		Tailor tailor=new Tailor();
		tailor.stitch();

	}

}
