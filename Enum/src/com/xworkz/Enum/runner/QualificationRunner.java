package com.xworkz.Enum.runner;

import com.xworkz.Enum.constants.Country;
import com.xworkz.Enum.constants.Qualification;
import com.xworkz.Enum.dto.RegisterDTO;

public class QualificationRunner {

	public static void main(String[] args) {
		
		
		RegisterDTO registerDTO= new RegisterDTO("Deepak","Atria",Qualification.BE);
		
		String collegeName=registerDTO.getCollegeName();
		System.out.println(collegeName.toUpperCase());
		Country country=registerDTO.getCountry();
		
		
		System.out.println("Code :"+country.getCode());
	}

}
