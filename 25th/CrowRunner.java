class CrowRunner
{
	public static void main(String[] args)
	
	{
		System.out.println("Start main in CrowRunner");
		
		Crow crow=new Crow();
		String name=crow.name;
		crow.name="Abc";
		System.out.println("Crow name:"+name);
		System.out.println("Crow name:"+crow.name);
	
	    
		int age=crow.age;
		crow.age=22;
		System.out.println("Crow age:"+age);
		System.out.println("Crow updated age:"+crow.age);
	
	
	    System.out.println("====================================");
		
		
        Crow crow1=new Crow();
		crow1.age=23;
		System.out.println("Crow updated age:"+crow1.age);
		crow1.name="Efg";
		System.out.println("Crow updated name:"+crow1.name);
		
		
		
		System.out.println("End main in CrowRunner");
	}
}