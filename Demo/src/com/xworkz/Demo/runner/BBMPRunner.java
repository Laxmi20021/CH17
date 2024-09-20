package com.xworkz.Demo.runner;

import com.xworkz.Demo.impl.RahulRoadContractImpl;
import com.xworkz.Demo.media.RoadContract;
import com.xworkz.Demo.use.BBMP;

public class BBMPRunner {

	public static void main(String[] args) {
		
		RoadContract roadContract=new RahulRoadContractImpl();

		BBMP bbmp=new BBMP(roadContract);
		bbmp.payment();


	}

}
