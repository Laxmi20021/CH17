package com.xworkz.tejaa.runner;

import com.xworkz.tejaa.constant.ProductType;
import com.xworkz.tejaa.dto.CustomerDTO;

public class ProductTypeRunner {

	public static void main(String[] args) {
		
		CustomerDTO customer=new CustomerDTO("Laxmi","Laxmi@gmail.com",ProductType.FURNITURE);
		customer.display();

	}

}
