package com.xworkz.Laptop.Internal;



public class SatJioAirtelInternetProvider extends JioAirtelInternetProvider{
	
	
	
	private double cost;
	private String launchDate;
	public SatJioAirtelInternetProvider(String name, String ceoName,double cost,String launchDate) {
		super(name, ceoName);
		this.cost=cost;
		this.launchDate=launchDate;
		
	}
	public String toString() {
		return "SatjioInternetProvider [cost=" + cost + ", launchDate=" + launchDate + ", toString()=" + super.toString()+ "]";
	}
	public void service() {
		System.out.println("running service method in SatjioInternetProvider");
	}

}
