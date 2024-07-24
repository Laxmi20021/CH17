class AutorikshawRunner
{
	public static void main(String[] args)
	{
		System.out.println("Start main in AutorikshawRunner");
		Autorikshaw autoriksha=new Autorikshaw(); //allocate ,copy ,invoke , return,default,
		
		String drivername=autoriksha.drivername;
		String brand=autoriksha.brand;
		double price=autoriksha.price;
		
		
		System.out.println("autoriksha drivername:"+drivername);
		System.out.println("autoriksha brand:"+brand);
        System.out.println("autoriksha price:"+price);

		
		
		autoriksha.drivername="ABC";
		autoriksha.brand="TATA";
		autoriksha.price=150;
		
		System.out.println("autoriksha updated drivername:"+autoriksha.drivername);
		System.out.println("autoriksha updated brand: "+autoriksha.brand);
		System.out.println("autoriksha updated price:"+autoriksha.price);
        System.out.println("======================");
		
		Autorikshaw autoriksha1=new Autorikshaw();
		autoriksha1.drivername="EFG";
		autoriksha1.brand="Toyota";
		autoriksha1.price=100;
		
		System.out.println("autoriksha1 updated drivername:"+autoriksha1.drivername);
		System.out.println("autoriksha1 updated brand:"+autoriksha1.brand);
		System.out.println("autoriksha1 updated price:"+autoriksha1.price);
		
		
		System.out.println("End main in AutorikshawRunner");

	}
}