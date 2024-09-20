package com.xworkz.Demo.runner;

import com.xworkz.Demo.impl.Highwaycode;
import com.xworkz.Demo.media.TrafficRule;
import com.xworkz.Demo.use.Roadlaws;

public class TrafficRunner {

	public static void main(String[] args) {
		
		TrafficRule trafficRule=new Highwaycode();
		Roadlaws roadLaws=new Roadlaws(trafficRule);
		roadLaws.signals("KA25LP2002");
		

	}

}

