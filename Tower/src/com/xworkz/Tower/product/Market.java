package com.xworkz.Tower.product;

public class Market{
	
	private String Name;
	private String Location;
	private int shops;
	private String type;
	
	public Market(String string, String string2, int i, String string3) {
		// TODO Auto-generated constructor stub
	}
	public void Market(String Name , String Location)
	{
		this.Name=Name;
		this.Location=Location;
		System.out.println("running String , string const in market");
		
	}
	public void dispaly()
	{
		System.out.println("Display Market");
		System.out.println("Name:"+this.Name);
		System.out.println("Location:"+this.Location);
		System.out.println("Number of shops:"+this.shops);
		System.out.println("type:"+this.type);
		
	}
	public void setShops(int shops)
	{
		this.shops=shops;
		
	}
	public void setType(String type) 
	{
        this.type = type;
    }

}
