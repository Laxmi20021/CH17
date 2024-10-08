package com.xworkz.Interface.runner;

import com.xworkz.Interface.functional.FoodApp;
import com.xworkz.Interface.functional.Starter;
import com.xworkz.Interface.usage.Labour;

public class LambdaRunner {

	public static void main(String[] args) {

		
		
		Starter starter=()->{
			
			System.out.println("running on in lambda expression");
		};
		
		Labour labour=new Labour();
		labour.startMotor(starter);
	
	
	FoodApp foodApp=(String item, int quantity)->{
		System.out.println("Food App Item :"+item);
		System.out.println("Food App Quantity :"+quantity);
	};
	
	labour.orderFood(foodApp);
	

	}
}