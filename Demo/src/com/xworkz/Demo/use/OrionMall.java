package com.xworkz.Demo.use;

import com.xworkz.Demo.media.MallRules;

public class OrionMall {

	private MallRules mallRules;

	public OrionMall(MallRules mallRules) {
		System.out.println("running in OrionMall");
		this.mallRules = mallRules;
	}

	public void Choiceclothes(String validId) {
		System.out.println("running in OrionMall");
		if (mallRules != null) {
			boolean complete = mallRules.validId();
			if (complete) {
				System.out.println("id is valid");

			} else {
				System.out.println("id is not valid");
			}
		} else {
			System.out.println("id is null");
		}

	}
}
