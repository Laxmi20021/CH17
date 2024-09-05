package com.xworkz.holiday.internal;

public class Geyser {
	
	//super:super(); super.var; super.methods()
	//this:this(); this.var; this.methods()
	
	@Override
	protected Object clone()throws CloneNotSupportedException
	{
		return super.clone();
		
	}
	
	public void heat()
	{
		System.out.println("running Heat in Geyser..........");
	}
	
	
}
