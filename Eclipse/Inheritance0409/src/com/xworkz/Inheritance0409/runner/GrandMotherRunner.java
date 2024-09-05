package com.xworkz.Inheritance0409.runner;

import com.xworkz.Inheritance0409.things.Daughter;
import com.xworkz.Inheritance0409.things.Mother;
import com.xworkz.Inheritance0409.things.Son;
import com.xworkz.Inheritance0409.things.Sons;

public class GrandMotherRunner {

	public static void main(String[] args)
	{
		
		Daughter daughter = new Daughter(); 
		
		daughter.showD();
		daughter.showM();  
		daughter.showG(); 
		
		Sons sons = new Sons();  
		sons.showS();  
		sons.showM();    
		sons.showG(); 
		
		Mother mother=new Mother();
		mother.showM();
		
		}    

	}


