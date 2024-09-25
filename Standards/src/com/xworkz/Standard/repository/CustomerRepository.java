package com.xworkz.Standard.repository;

public interface CustomerRepository {
	
    void save();
    
    
    //dummy implementation
    default int update()
    {
    	return 0;
    }
	
	
	
	

}
