package com.xworkz.holiday.internal;

public class Nagaraj {
	
	//reference of same type or reference of sub-class
	public void Buy(HairDryer hairDryer)

	{
		System.out.println("running Buy in nagaraj");
		hairDryer.blowCoolAir();
		if(hairDryer instanceof PhilipsHairDryer)
		{
			System.out.println("instance is of philipsHairDryer");
			PhilipsHairDryer philipsHairDryer=(PhilipsHairDryer)hairDryer;
			philipsHairDryer.blowWarmAir();
		}
	}
	
	public void Buy(Geyser geyser)
	{
		System.out.println("running buy in nagarj");
		geyser.heat();
	
	
	if(geyser instanceof BajajGeyser)
	{
		System.out.println("instance is of BajajGeyser");
		//casting
		BajajGeyser bajajGeyser=(BajajGeyser)geyser;
	}
	
	}
}
