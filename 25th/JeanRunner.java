class JeanRunner
{
	public static void main(String[] args)
	
	{
		System.out.println("Start main in JeanRunner");
		
		Jean jean=new Jean();
		double price=jean.price;
		jean.price=750;
		System.out.println("Jean price:"+price);
		System.out.println("Jean Updated price:"+jean.price);
		
		String brand=jean.brand;
		jean.brand="Levi's";
		System.out.println("Jean brand:"+brand);
		System.out.println("Jean updated brand:"+jean.brand);
		
		char size=jean.size;
		jean.size='M';
		System.out.println("Jean size:"+size);
		System.out.println("Jean updated size:"+jean.size);
		
		Jean jean1=new Jean();
		jean1.price=850;
		System.out.println("Jean updated price:"+jean1.price);
		
		Jean jean2=new Jean();
		jean2.price=650;
		System.out.println("Jean updated price:"+jean2.price);
		
		Jean jean3=new Jean();
		jean3.price=550;
		System.out.println("Jean updated price:"+jean3.price);
		
		
		
		System.out.println("End main in JeanRunner");
	}
}





