package com.xworkz.holiday.runner;

import com.xworkz.holiday.internal.BajajGeyser;
import com.xworkz.holiday.internal.Geyser;
import com.xworkz.holiday.internal.HairDryer;
import com.xworkz.holiday.internal.Nagaraj;
import com.xworkz.holiday.internal.PhilipsHairDryer;

public class HairDryerRunner {

	public static void main(String[] args) {
		
		Nagaraj nagaraj=new Nagaraj();
		
		HairDryer hairDryer=new HairDryer();
		HairDryer hairDryer1=new PhilipsHairDryer();
		HairDryer hairDryerParent=new HairDryer();
		nagaraj.Buy(hairDryer);
		System.out.print("===========================");
		
		
		Geyser geyser=new Geyser();
		nagaraj.Buy(geyser);
		
		BajajGeyser bajajGeyser=new BajajGeyser();
		nagaraj.Buy(bajajGeyser);
		bajajGeyser.warm();
		
		System.out.println("*********************");
		nagaraj.Buy(geyser);
		BajajGeyser bajajGeyser1=new BajajGeyser();
		nagaraj.Buy(bajajGeyser1);

	}

}
