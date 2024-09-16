package com.xworkz.Rules.impl;

import com.xworkz.Rules.media.Passenger;
import com.xworkz.Rules.media.Railway;

public class RailwayStationRule implements Railway, Passenger{
	
	public RailwayStationRule()
	{
		super();
		System.out.println("running no-args const in RailwayStationRule");
	}

	public boolean SeeCorrecteatNumber() {
		System.out.println("running SeeCorrectSeatNumber");
		return true;//Avoid Unattended Luggage
	}

	@Override
	public String VarifyTrain() {
		System.out.println("running VarifyTrain");
		return null;
	}

	@Override
	public boolean VarifyTrainNumber() {
		System.out.println("running VarifyTrainNumber");
		return false;
	}

	@Override
	public String FollowAnnouncements() {
		
		System.out.println("running FollowAnnouncements");
		return null;
	}

	@Override
	public String RespectQueueSystems() {
		System.out.println("running RespectQueueSystems");
		return null;
	}

	@Override
	public int CarryaValidTicket() {
		System.out.println("running CarryaValidTicket");
		return 0;
	}

	@Override
	public String NoSmoking() {
		System.out.println("running NoSmoking");
		return null;
	}

	@Override
	public String FollowSecurityChecks() {
		System.out.println("running FollowSecurityChecks");
		return null;
	}

	@Override
	public boolean CheckCorrectPlatfrom() {
		System.out.println("running CheckCorrectPlatfrom");
		return false;
	}

	@Override
	public String NoSpitting() {
		System.out.println("running NoSpitting");
		return null;
	}

	@Override
	public boolean SeeCorrectSeatNumber() {
		System.out.println("running SeeCorrectSeatNumber");
		return false;
	}

	
}


