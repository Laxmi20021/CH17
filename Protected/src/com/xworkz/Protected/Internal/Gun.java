package com.xworkz.Protected.Internal;

public class Gun extends Weapon{
	
	@Override
	protected void use()
	{
		System.out.println("Running use in Gun");
	}
	
	@Override
	public void fire()
	{
		System.out.println("Running Fire in Gun");
	}
	
	public void Bullete()
	{
		use();
		fire();
		System.out.println("Running Bullete in Gun");
	}

}
