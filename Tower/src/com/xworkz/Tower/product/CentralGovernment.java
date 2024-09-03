package com.xworkz.Tower.product;

public class CentralGovernment extends Government
{
	public CentralGovernment(String state, int noOfMlas) 
	{
        super(state, noOfMlas);
    }
	
	public CentralGovernment copy() {
        CentralGovernment copy = new CentralGovernment(this.getState(), this.getNoOfMlas());
        copy.setPartyHeadName(this.getPartyHeadName());
        copy.setHomeMinisterName(this.getHomeMinisterName());
        return copy;
    }

}
