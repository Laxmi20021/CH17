package com.xworkz.Rules.impl;

import com.xworkz.Rules.media.College;
import com.xworkz.Rules.media.Student;

public class CollegeRule implements College, Student{
	
	public CollegeRule()
	{
		super();
		System.out.println("running no-args const in  collegerules");
	}

	@Override
	public String BePunctual() {
		System.out.println("running BePunctual");
		return null;
	}

	@Override
	public String UseTechnologyWisely() {
		System.out.println("running UseTechnologyWisely");
		return null;
	}

	@Override
	public boolean MaintainCampusCleanliness() {
		System.out.println("running MaintainCampusCleanliness");
		return false;
	}

	@Override
	public String ReportMisconduct() {
		System.out.println("running ReportMisconduct");
		return null;
	}

	@Override
	public String FollowHealthandSafetyGuidelines() {
		System.out.println("running FollowHealthandSafetyGuidelines");
		return null;
	}

	@Override
	public String FollowtheDressCode() {
		System.out.println("running FollowtheDressCode");
		return null;
	}

	@Override
	public int MaintainAcademicIntegrity() {
		System.out.println("running MaintainAcademicIntegrity");
		return 0;
	}

	@Override
	public boolean NoSmokingorAlcohol() {
		System.out.println("running NoSmokingorAlcohol");
		return false;
	}

	@Override
	public String ParticipateinCollegeEvents() {
		System.out.println("running ParticipateinCollegeEvents");
		return null;
	}

	@Override
	public boolean RespectCampusTimings() {
		System.out.println("running RespectCampusTimings");
		return false;
	}
	
	

}
