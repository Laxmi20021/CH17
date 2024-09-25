package com.xworkz.Demo.use;

import com.xworkz.Demo.media.PGRule;

public class SaiPg {

	private PGRule pGRule;

	public void setPG(PGRule pGRule) {
		this.pGRule = pGRule;

	}

	public void check() {
		if (pGRule != null) {
			System.out.println("pg rule is not null");
			double cost = pGRule.costPerMonth();
			boolean network = pGRule.wifi();
			if (network) {
				System.out.println("network is not null");
			} else {
				System.out.println("network is null");
			}
		}

	}
}
