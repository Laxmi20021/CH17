package com.xworkz.Standard.service;

import com.xworkz.Standard.repository.Repository;

public class Service implements Repository{

	@Override
	public boolean save() {
		System.out.println("running in Servioce");
		return false;
	}

	@Override
	public int update() {
		System.out.println("running in Service");
		return 0;
	}

}
