package com.xworkz.Demo.use;

import com.xworkz.Demo.media.TrafficRule;

public class Roadlaws {
	
private TrafficRule trafficRule;
	
	public Roadlaws(TrafficRule trafficRule)
	{
		System.out.println("running in Roadlaws");
		this.trafficRule=trafficRule;
	}

	public void signals(String regno)
	{
		System.out.println("running signals in Roadlaws");
		if(trafficRule !=null)
		{
			String complete=trafficRule.LincenceNo(regno);
			if(complete !=null) {
				System.out.println("signals are on");
				System.out.println("Registration Number id   :   "+complete);
			}else {
				System.out.println("signlas are off");
			}
			}else {
				System.out.println("trafficRule is null");
		}

}
	
}
