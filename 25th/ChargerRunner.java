class ChargerRunner
{
	public static void main(String[] args)
	
	{
		System.out.println("Start main in ChargerRunner");
		
		Charger charger=new Charger();
		double price=charger.price;
		charger.price=1500;
		System.out.println("Charger price:"+price);
		System.out.println("Charger updated price:"+charger.price);
		
		
		String brand=charger.brand;
		charger.brand="Samsung";
		System.out.println("Charger brand:"+brand);
		System.out.println("Charger updated brand:"+charger.brand);
		
		
		double outputVoltage=charger.outputVoltage;
		charger.outputVoltage=12;
		System.out.println("Charger outputVoltage:"+outputVoltage);
		System.out.println("Charger updated outputVoltage:"+charger.outputVoltage);
		
	    System.out.println("======================================");
    	
		Charger charger1=new Charger();
		
		charger1.price=1450;
		System.out.println("Charger updated price:"+charger1.price);
		charger1.brand="Real Me";
		System.out.println("Charger updated brand:"+charger1.brand);
		
		System.out.println("===============================");
		
		Charger charger2=new Charger();
		charger2.price=1250;
		System.out.println("Charger updated price:"+charger2.price);
		
		System.out.println("End main in ChargerRunner");
	}
}