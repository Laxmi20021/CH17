package com.xworkz.Rules.runner;

import com.xworkz.Rules.impl.FortisHospital;
import com.xworkz.Rules.media.GovernmentHospitalRule;

public interface HospitalRunner {

	public static void main(String[] args) {

		
		GovernmentHospitalRule governmentHospitalRule=new FortisHospital();
		governmentHospitalRule.maintainSilence();
		governmentHospitalRule.serve();
		governmentHospitalRule.visitorAllowed();
		
	}

}
