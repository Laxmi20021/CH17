package com.xworkz.Object0509.runner;

import com.xworkz.Object0509.internal.Belt;
import com.xworkz.Object0509.internal.Dancer;
import com.xworkz.Object0509.internal.LeatherBelt;

public class BeltRunner {

	public static void main(String[] args) {
		
		Dancer dancer=new Dancer();
		Belt belt=new Belt();
		dancer.use(belt);
		
		LeatherBelt leatherBelt=new LeatherBelt();
		dancer.use(leatherBelt);

	}

}
