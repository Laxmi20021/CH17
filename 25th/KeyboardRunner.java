class KeyboardRunner
{
	public static void main(String[] args)
	{
		System.out.println("Start main in KeyboardRunner");
		
		 Keyboard keyboard=new Keyboard();
		 keyboard.noOfKeys=104;
		 keyboard.brand="hp";
		 int specialcharacters=keyboard.specialcharacters;
		 System.out.println(" keyboard noOfKeys:"+keyboard.noOfKeys);
		 System.out.println(" keyboard brand:"+keyboard.brand);
		 System.out.println(" keyboard specialcharacters:"+specialcharacters);
		 Keyboard keyboard1=new Keyboard();
		 keyboard1.noOfKeys=104;
		 keyboard1.brand="hp";
		 keyboard1.specialcharacters=8;
		 System.out.println(" keyboard  updated noOfKeys:"+keyboard1.noOfKeys);
		 System.out.println(" keyboard  updated brand:"+keyboard1.brand);
		 System.out.println(" keyboard  updated specialcharacters:"+keyboard1.specialcharacters);
		 
		 System.out.println("End main in KeyboardRunner");
	}
}