package com.xworkz.Demo.runner;

import com.xworkz.Demo.impl.KACricketRuleImpl;
import com.xworkz.Demo.media.CricketRule;
import com.xworkz.Demo.use.BCCI;

public class CricketRunner {

	public static void main(String[] args) {
		
		CricketRule cricketRule=new KACricketRuleImpl();

		
		BCCI bcci=new BCCI();
		bcci.setCricketRule(cricketRule);
		bcci.check();
	}

}
