package com.xworkz.Tower.product;

public class Government {
	
	private String state;
    private int noOfMlas;
    private String partyHeadName;
    private String homeMinisterName;
    
    public Government(String state, int noOfMlas)
    {
        this.state = state;
        this.noOfMlas = noOfMlas;
    }
    
    public String getState()
    {
        return state;
    }
    public void setState(String state) {
        this.state = state;
    }

    public int getNoOfMlas() {
        return noOfMlas;
    }

    public void setNoOfMlas(int noOfMlas) {
        this.noOfMlas = noOfMlas;
    }

    public String getPartyHeadName() {
        return partyHeadName;
    }

    public void setPartyHeadName(String partyHeadName) {
        this.partyHeadName = partyHeadName;
    }

    public String getHomeMinisterName() {
        return homeMinisterName;
    }

    public void setHomeMinisterName(String homeMinisterName) {
        this.homeMinisterName = homeMinisterName;
    }

    
    public void printDetails() {
        System.out.println("State: " + state);
        System.out.println("Number of MLAs: " + noOfMlas);
        System.out.println("Party Head Name: " + partyHeadName);
        System.out.println("Home Minister Name: " + homeMinisterName);
    }

    
    public Government display() {
        Government copy = new Government(this.state, this.noOfMlas);
        copy.partyHeadName = this.partyHeadName;
        copy.homeMinisterName = this.homeMinisterName;
        return copy;
    }



}
