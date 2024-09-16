package com.xworkz.Rules.runner;

import com.xworkz.Rules.impl.RailwayStationRule;

public class RailwayStationRunner {

	public static void main(String[] args) {
		
		RailwayStationRule railwayStationRule=new RailwayStationRule();
		railwayStationRule.CarryaValidTicket();
		railwayStationRule.CheckCorrectPlatfrom();
		railwayStationRule.FollowAnnouncements();
		railwayStationRule.FollowSecurityChecks();
		railwayStationRule.NoSmoking();
		railwayStationRule.NoSpitting();
		railwayStationRule.RespectQueueSystems();
		railwayStationRule.SeeCorrecteatNumber();
		railwayStationRule.SeeCorrectSeatNumber();
		railwayStationRule.VarifyTrain();
		railwayStationRule.VarifyTrainNumber();
		
		
		

	}

}
