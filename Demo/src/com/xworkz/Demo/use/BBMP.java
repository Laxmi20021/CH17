package com.xworkz.Demo.use;


import com.xworkz.Demo.media.RoadContract;

public class BBMP {
	
	private RoadContract  roadContract;
	
	public BBMP(RoadContract roadContract)
	{
		this.roadContract=roadContract;
	}
	
	public void payment()
	{
		System.out.println("running paymenyt in bbmp");
		
		if(roadContract !=null)
		{
			boolean complete=roadContract.completeWork();
			if(complete)
			{
				System.out.println("will release payment");
			}
			else
			{
				System.out.println("will not release payment");
			}
			
			
			
		}
		else {
			System.out.println("roadContract is null");
		}
	}

}
