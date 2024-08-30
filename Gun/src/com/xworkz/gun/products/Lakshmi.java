package com.xworkz.gun.products;

public class Lakshmi {



	public void dry(WashingMachine washingMachine) {
		if (washingMachine != null) {
			System.out.println("running dry in Lakshmi");
			washingMachine.rinse();
			washingMachine.show();
		} else {
			System.out.println("wahing machine is null");
		}
	}

}