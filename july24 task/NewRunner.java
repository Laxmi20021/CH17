class NewRunner
{
	public static void main(String[] args)
	{
		System.out.println("Start main in NewRunner");
		
		AirCondition aircondition=new AirCondition(); 
		String brand=aircondition.brand;
		double price=aircondition.price;
		int quality=aircondition.quality;
		System.out.println("aircondition brand:"+brand);
        System.out.println("aircondition price:"+price);
		System.out.println("AirCondition quality:"+quality);
		
		
		
		Autorikshaw autoriksha=new Autorikshaw(); 
		String drivername=autoriksha.drivername;
		String brand=autoriksha.brand;
		double price=autoriksha.price;
		System.out.println("autoriksha drivername:"+drivername);
		System.out.println("autoriksha brand:"+brand);
        System.out.println("autoriksha price:"+price);
		
		
		
		AutoDriver autodriver=new AutoDriver(); 
		String drivername=autodriver.drivername;
		int age=autodriver.age;
		double salary=autodriver.salary;
		System.out.println("autodriver drivername:"+drivername);
        System.out.println("autodriver age:"+age);
		System.out.println("autodriver salary:"+salary);
		
		
		
		Rapido rapido=new Rapido();
		String bikename=rapido.bikename;
		String location=rapido.location;
		double price=rapido.price;
		System.out.println("rapido bikename:"+bikename);
        System.out.println("rapido location:"+location);
		System.out.println("rapido price:"+price);
		
		
		
		FoodDeliveryCompany fooddeliverycompany=new FoodDeliveryCompany(); 
		double price=fooddeliverycompany.price;
		String location=fooddeliverycompany.location;
		String item=fooddeliverycompany.item;
		String deliveryboyname=fooddeliverycompany.deliveryboyname;
		System.out.println("fooddeliverycompany price:"+price);
        System.out.println("fooddeliverycompany location:"+location);
        System.out.println("fooddeliverycompany item:"+item);
		System.out.println("fooddeliverycompany deliveryboyname:"+deliveryboyname);
		
		
		
		CabCompany Cabcompany=new CabCompany();
	    String nameOfCompany=Cabcompany.nameOfCompany;
	    double price1=Cabcompany.price;
	    boolean isAvailable1=Cabcompany.isAvailable;
	    System.out.println("Cabcompany nameOfCompany:"+nameOfCompany);
	    System.out.println("Cabcompany price:"+price1);
	    System.out.println("Cabcompany isAvailable:"+isAvailable1);
		
		
		
		Rupee rupee=new Rupee();
	    String symbol=rupee.symbol;
	    String country= rupee.country;
	    int rupeeCode= rupee.rupeeCode;
	    System.out.println("Rupee symbol:"+symbol);
	    System.out.println("Rupee country:"+country);
	    System.out.println("Rupee rupeeCode:"+rupeeCode);
		

		
		BMTC bmtc=new BMTC();
	String colour=bmtc.colour;
	String busStation=bmtc.busStation;
	long contactNo=bmtc.contactNo;
	System.out.println("BMTC colour:"+colour);
	System.out.println("BMTC busStation:"+busStation);
	System.out.println("BMTC contactNo:"+contactNo);
	
	System.out.println("Ending main in NewRunner");
	}
}