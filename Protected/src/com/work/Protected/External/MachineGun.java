package com.work.Protected.External;
import  com.xworkz.Protected.Internal.Weapon;

public class MachineGun extends Weapon{
	
	protected void use()
	{
		System.out.println("Running use in MachineGun");
	}
	
	public void fire()
	{
		System.out.println("Running Fire in MachineGun");
	}
	
	public void Dash()
	{
		use();
		fire();
		System.out.println("Running Dash in MachineGun");
	}



}
