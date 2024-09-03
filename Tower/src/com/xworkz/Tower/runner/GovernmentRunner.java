package com.xworkz.Tower.runner;
import com.xworkz.Tower.product.Government;
import com.xworkz.Tower.product.StateGovernment;
import com.xworkz.Tower.product.CentralGovernment;

import com.xworkz.Tower.product.StateGovernment;

public class GovernmentRunner {

	public static void main(String[] args) {
		
		StateGovernment stateGov = new StateGovernment("California", 120);
        stateGov.setPartyHeadName("John Doe");
        stateGov.setHomeMinisterName("Jane Smith");


	}

}
