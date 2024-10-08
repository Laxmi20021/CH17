package com.xworkz.Enum.constants;

public enum City {
	
	HASSAN(100), TIPATUR(80), BALLARY(250),BAGALAKOT(800),GOA(1500),BELAGAVI(90), getTicketprice;

	private int ticketprice;
	private City(int ticketprice)
	{
		System.out.println("Assiging ticket price");
		this.ticketprice=ticketprice;
	}
	
	City() {
		System.out.println("-----------");
	}

	public int getTicketprice()
	{
		return this.ticketprice;
	}

	public int setTicketPrice(int price) 
	{
		return this.ticketprice=price;
	}
}
