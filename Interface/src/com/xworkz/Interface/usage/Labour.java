package com.xworkz.Interface.usage;

import com.xworkz.Interface.functional.FoodApp;
import com.xworkz.Interface.functional.Starter;

public class Labour {
	
	
	public void startMotor(Starter starter)
	{
		System.out.println("running startmotor in labour");
		
		if(starter!=null)
		{
			
			System.out.println("starter in not null");
			starter.on(); //abstraction
		}
		else {
			System.out.println("starter is null.....");
		}
		
		System.out.println("exit startMotor in labour");
	}
	public void orderFood(FoodApp foodApp)
	{
		System.out.println("running orderFood in labour");
		if(foodApp != null)
		{
			System.out.println("foodapp is not null");
			foodApp.order("Idli", 150);
		}
		
	}
	
			
		
	

}
