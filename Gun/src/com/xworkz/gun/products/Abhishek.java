package com.xworkz.gun.products;

public class Abhishek {


	private WashingMachine washingMachine;

	public Abhishek(WashingMachine washingMachine) {
		super();
		this.washingMachine = washingMachine;
	}

	public void clean() {
		if (washingMachine != null) {
			System.out.println("running clean in Abhishek");
			washingMachine.rinse();
			washingMachine.show();
		} else {
			System.out.println("washing machine is null");
		}
	}

}
