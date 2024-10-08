package com.xworkz.Enum.runner;

import com.xworkz.Enum.constants.City;

public class CityRunner {

	public static void main(String[] args) {

		System.out.println("city runner is running");
		City ref=City.BALLARY;
		System.out.println("City name is :"+ref);
		
		
		City[] allCitys=City.values();
		for(int index=0; index<allCitys.length;index++)
		{
			System.err.println("city name is :: "+allCitys[index]
					+"ticket price is:"+ allCitys[index].getTicketprice);
			
			
		}
		
		int tipaturTicketprice=City.TIPATUR.getTicketprice();
		System.out.println("TIPATUR tickectprice is:"+tipaturTicketprice);
				
				
		int index=City.BELAGAVI.ordinal();	
		System.out.println("belagavi variable index:"+index);
		
		String  cityName=City.GOA.toString();
		
		int ref5=City.BALLARY.setTicketPrice(1800);
		System.out.println("before setting ticket price:"+ref5);
		int ref1=City.BALLARY.setTicketPrice(1500);
		System.out.println("after setting ticket price:"+ref1);
	}

}
