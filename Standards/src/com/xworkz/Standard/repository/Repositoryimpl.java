package com.xworkz.Standard.repository;

public class Repositoryimpl implements Repository{
	
	
	public Repositoryimpl()
	{
		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>");
	}

	@Override
	public boolean save() {
		System.out.println("running Repositoryimpl");
		return false;
	}

	@Override
	public int update() {
		System.out.println("running in Repositoryimpl");
		return 0;
	}

}
