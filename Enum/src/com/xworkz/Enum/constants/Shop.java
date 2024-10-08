package com.xworkz.Enum.constants;

public enum Shop {
	
	HP(25000), DELL(300000), LENOVO(50000), ACER(900000), MAC(100000), MI(55000), getPrice;
    private int price;
    private Shop()
    {
    	this.price=10000;
    	System.out.println("default value assign");
    }
    
    public int getPrice()
    {
    	return this.price;
    	
    }
    
    private Shop(int laptopPrice)
    {
    	System.out.println("laptop price is seting ");
    	this.price=laptopPrice;
    }
	
}
