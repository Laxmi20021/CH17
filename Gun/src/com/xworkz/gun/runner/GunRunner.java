package com.xworkz.gun.runner;

import com.xworkz.gun.products.Dboss;
import com.xworkz.gun.products.Godse;
import com.xworkz.gun.products.Gun;
import com.xworkz.gun.products.Police;
import com.xworkz.gun.products.Solider;

public class GunRunner {

	public static void main(String[] args) {
		
		Solider solider = new Solider();
		solider.trigger();
		Police police = new Police();
		Gun gun = new Gun("MI895", "India", "Revolver");
		police.shoot(gun);
		Dboss dboss = new Dboss(gun);
		dboss.use();
		Godse godse = new Godse();
		godse.hold();


	}

}
