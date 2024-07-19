class Lipstick
{
	//ref of a string
	public static void brands(String[] brands)
	
	{
		
		System.out.println("start brands in Lipstick");
		
		for(int position=0;position<brands.length;position++)
		{
			String ref=brands[position];
			System.out.println("Brands:"+ref);
		}
		
		
		System.out.println("end brands in Lipstick");
	}
	
	public static void modelNo(int[] models)
	{
		System.out.println("start models in Lipstick ");
		for(int no=0;no<models.length;no++)
		{
			int ref=models[no];
			System.out.println("models:"+ref);
		}
		System.out.println("end models in Lipstick");
	}
	
}
