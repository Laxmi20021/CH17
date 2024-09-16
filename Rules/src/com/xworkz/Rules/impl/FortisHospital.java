package com.xworkz.Rules.impl;

import com.xworkz.Rules.media.GovernmentHospitalRule;

public class FortisHospital implements GovernmentHospitalRule{ 
	
	public FortisHospital()
	{
		
		super();
		System.out.println("running no-args const in FortisHospital");
	}
	
	public boolean maintainSilence()
	{
		System.out.println("running maintainSilence");
		return true;
	}
	public int visitorAllowed()
	{
		System.out.println("running visitorAllowed");
		return 2;
		
	}
	public boolean serve()
	{
		System.out.println("running serve");
		return false; 
	}

}
