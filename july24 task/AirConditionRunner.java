class AirConditionRunner
{
	public static void main(String[] args)
	{
		System.out.println("Start main in AirConditionRunner");
		AirCondition aircondition=new AirCondition(); //allocate ,copy ,invoke , return,default,
		
		String brand=aircondition.brand;
		double price=aircondition.price;
		int quality=aircondition.quality;
		
		System.out.println("aircondition brand:"+brand);
        System.out.println("aircondition price:"+price);

		System.out.println("AirCondition quality:"+quality);
		
		aircondition.brand="LG";
		aircondition.price=4500;
		aircondition.quality=100;
		
		System.out.println("aircondition updated brand:"+aircondition.brand);
		System.out.println("airconditionupdated price: "+aircondition.price);
		System.out.println("aircondition updated quality:"+aircondition.quality);
        System.out.println("======================");
		
		AirCondition aircondition1=new AirCondition();
		aircondition1.brand="Croma";
		aircondition1.price=5000;
		aircondition1.quality=100;
		
		System.out.println("aircondition1 updated brand:"+aircondition1.brand);
		System.out.println("aircondition1 updated price:"+aircondition1.price);
		System.out.println("aircondition1 updated quantity:"+aircondition1.quality);
		
		
		System.out.println("End main in airconditionRunner");

	}
}