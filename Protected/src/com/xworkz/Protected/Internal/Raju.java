package com.xworkz.Protected.Internal;

public class Raju {
	
	Weapon weapon=new Weapon();
	
	public void kill()
	{
		System.out.println("Running kill in Raju");
		weapon.use();
		weapon.fire();
	}
	
	Gun gun=new Gun();
	
	public void Shoot()
	{
		System.out.println("Running Shoot in Raju");
		gun.use();
		gun.fire();
	}
	

}
