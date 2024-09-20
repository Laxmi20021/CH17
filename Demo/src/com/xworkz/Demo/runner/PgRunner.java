package com.xworkz.Demo.runner;

import com.xworkz.Demo.media.PGRule;
import com.xworkz.Demo.use.SaiPg;

public class PgRunner {

	public static void main(String[] args) {
		
		PGRule pgrule=new LadiesPg();
		System.out.println(pgrule.costPerMonth());
		System.out.println(pgrule.wifi());
		SaiPg saiPg=new SaiPg();
		saiPg.setPG(pgrule);
		saiPg.check();

	}

}
