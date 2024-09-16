package com.xworkz.Rules.impl;

import com.xworkz.Rules.media.Poojari;
import com.xworkz.Rules.media.Temple;

public class TempleRule implements Temple, Poojari{
	
	public TempleRule()
	{
		super();
		System.out.println("running no-args const in TempleRule");
	}

	@Override
	public String ParticipateinOfferings() {
		System.out.println("running ParticipateinOfferings");
		return null;
	}

	@Override
	public boolean RespectTempleAuthorities() {
		System.out.println("running RespectTempleAuthorities");
		return false;
	}

	@Override
	public String KeepMobilePhonesSilent() {
		System.out.println("running KeepMobilePhonesSilent");
		return null;
	}

	@Override
	public int FollowTempleTimings() {
		System.out.println("running FollowTempleTimings");
		return 0;
	}

	@Override
	public boolean NoEatingInside() {
		System.out.println("running NoEatingInside");
		return false;
	}

	@Override
	public String MaintainSilence() {
		System.out.println("running MaintainSilence");
		return null;
	}

	@Override
	public String DressModestly() {
		System.out.println("running DressModestly");
		return null;
	}

	@Override
	public boolean RemoveFootwear() {
		System.out.println("running RemoveFootwear");
		return false;
	}

	@Override
	public String NoPhotography() {
		System.out.println("running NoPhotography");
		return null;
	}

	@Override
	public boolean ObserveCleanliness() {
		System.out.println("running ObserveCleanliness");
		return false;
	}

}
