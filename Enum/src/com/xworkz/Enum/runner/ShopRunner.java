package com.xworkz.Enum.runner;

import com.xworkz.Enum.constants.Shop;

public class ShopRunner {

	public static void main(String[] args) {
		
		System.out.println("shop runner is running.........");
		
		int hp = Shop.HP.getPrice();
		System.out.println("hp price is :"+ hp);
		
		int acer=Shop.ACER.getPrice();
		System.out.println("Acer price is :"+ acer);
		
		int mac=Shop.MAC.getPrice();
		System.out.println("mac price is :"+ mac);
		
		
		
		
		Shop [] allVariables=Shop.values();
		for(int i=0;i<allVariables.length;i++)
		{
			System.err.println(allVariables[i]+" price"+ allVariables[i].getPrice);
		}

	}

}
