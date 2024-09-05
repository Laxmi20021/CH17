package com.xworkz.Object0509.internal;


public class Dancer {
	
	public void use(Belt belt)
	{
		System.out.println("running use in dancer");
		belt.tie();
		
		if(belt instanceof LeatherBelt)
		{
			System.out.println("instance is of LeatherBelt");
			LeatherBelt leatherBelt=(LeatherBelt)belt;
			
		}
	}

}
