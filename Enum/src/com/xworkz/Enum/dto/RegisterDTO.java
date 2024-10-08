package com.xworkz.Enum.dto;

import com.xworkz.Enum.constants.Country;
import com.xworkz.Enum.constants.Qualification;

public class RegisterDTO {
	
	private String name;
	private String collegeName;
	private Qualification qualification;
	private Country country;
	
	public RegisterDTO()
	{
		
	}

	public RegisterDTO(String name, String collegeName, Qualification qualification) {
		super();
		this.name = name;
		this.collegeName = collegeName;
		this.qualification = qualification;
	}
	
	



	
	/**
	 * @return the country
	 */
	public Country getCountry() {
		return country;
	}

	/**
	 * @param country the country to set
	 */
	public void setCountry(Country country) {
		this.country = country;
	}

	public String getName() {
		return name;
	}



	
	public String getCollegeName() {
		return collegeName;
	}



	
	public Qualification getQualification() {
		return qualification;
	}
	
	

}
