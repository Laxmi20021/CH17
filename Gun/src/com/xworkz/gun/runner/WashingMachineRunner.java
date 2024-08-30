package com.xworkz.gun.runner;

import com.xworkz.gun.products.Bhumika;

public class WashingMachineRunner {

	public static void main(String[] args) {
		
		Megha megha = new Megha();
		megha.wash();
		Lakshmi lakshmi = new Lakshmi();
		WashingMachine washingMachine = new WashingMachine("Samsung", "topload", 12);
		lakshmi.dry(washingMachine);
		WashingMachine washingMachine1 = new WashingMachine("bosch", "frontload", 20);
		Abhishek abhishek = new Abhishek(washingMachine1);
		abhishek.clean();
		Bhumika bhumika = new Bhumika();
		bhumika.use();
		Nayana nayana = new Nayana();
		nayana.drumClean();
	}

}
