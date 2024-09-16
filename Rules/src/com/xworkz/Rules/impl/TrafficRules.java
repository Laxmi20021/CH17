package com.xworkz.Rules.impl;

import com.xworkz.Rules.media.FollowTrafficRules;
import com.xworkz.Rules.media.Traffic;

public class TrafficRules implements Traffic, FollowTrafficRules{
	
	public TrafficRules()
	{
		super();
		System.out.println("running no-args const in traffic rules");
	}

	@Override
	public String WearaSeatbelt() {
		System.out.println("running WearaSeatbelt"); 
		return null;
	}

	@Override
	public boolean NoDrunkDriving() {
		
        System.out.println("running nodrunkdriving");
		return false;
	}

	@Override
	public String WearHelmets() {
		System.out.println("running wearhelments");
		return null;
	}

	@Override
	public boolean UseIndicators() {
		
	    System.out.println("running useindicator");
		return false;
	}

	@Override
	public int AvoidRoadRage() {
		System.out.println("running avoidroadrange");
		return 0;
	}

	@Override
	public String AvoidSuddenBraking() {
		System.out.println("Running avoidsuddenbraking");
		return null;
	}

	@Override
	public int CheckBlindSpots() {
		System.out.println("running checkblindspots");
		return 0;
	}

	@Override
	public String DoNotBlockIntersections() {
		
		System.out.println("running DoNotBlockIntersections");
		return null;
	}

	@Override
	public String KeeptotheLeftLane() {
		System.out.println("running KeeptotheLeftLane");
		return null;
	}

	@Override
	public String StopatRailwayCrossings() {
		System.out.println("running StopatRailwayCrossings");
		return null;
	}

	@Override
	public boolean FollowTrafficSigns() {
		System.out.println("running FollowTrafficSigns");
		return false;
	}

	@Override
	public String NoOvertakinginCurves() {
		System.out.println("running NoOvertakinginCurves");
		return null;
	}

	@Override
	public boolean StopforSchoolBuses() {
		System.out.println("running StopforSchoolBuses");
		return false;
	}

	@Override
	public String NoDrinkAndDrive() {
		System.out.println("running NoDrinkAndDrive");
		return null;
	}

	@Override
	public String FollowTrafficLights() {
		System.out.println("running FollowTrafficLights");
		return null;
	}

}
