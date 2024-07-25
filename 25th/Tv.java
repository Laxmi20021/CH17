class Tv
{
	//declare the instance variable is the class without static keyword
	//each copy create in memory, values will change
	int size;
	double makingCost=15000;
	double sellingCost;
	String serialNo;
	int warranty=1; //literal
	int extendedWrranty;
	
	Tv()
	{
		System.out.println("Created Tv");
	}
}