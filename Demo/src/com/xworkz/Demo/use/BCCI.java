package com.xworkz.Demo.use;

import com.xworkz.Demo.media.CricketRule;

public class BCCI {
	
	
	private CricketRule cricketRule;
	
	public void setCricketRule(CricketRule cricketRule)
	{
		this.cricketRule=cricketRule;
	}
	
	public void check()
	{
		System.out.println("running check in bcci");
		if(cricketRule !=null) {
			System.out.println("cricket is not null");
		    cricketRule.powerPlay();
	  }
		
		else
		{
			System.out.println("cricket is null..........");
		}
	}	

}
