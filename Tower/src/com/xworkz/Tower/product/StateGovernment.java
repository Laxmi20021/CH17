package com.xworkz.Tower.product;

public class StateGovernment extends Government {
	
	public StateGovernment(String state, int noOfMlas) 
	{
        super(state, noOfMlas);
	}
	
	public StateGovernment copy() {
        StateGovernment copy = new StateGovernment(this.getState(), this.getNoOfMlas());
        copy.setPartyHeadName(this.getPartyHeadName());
        copy.setHomeMinisterName(this.getHomeMinisterName());
        return copy;
    }

}
