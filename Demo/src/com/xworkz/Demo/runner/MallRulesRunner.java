package com.xworkz.Demo.runner;

import com.xworkz.Demo.impl.MallOfAsia;
import com.xworkz.Demo.media.MallRules;
import com.xworkz.Demo.use.OrionMall;

public class MallRulesRunner {

	public static void main(String[] args) {

		MallRules mallRule=new MallOfAsia();
		OrionMall orionMall=new OrionMall(mallRule);
		orionMall.Choiceclothes("skjehbh");
		
	}

}


