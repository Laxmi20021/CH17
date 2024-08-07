class TrimmerRunner
{
	public static void main(String[] machine)
	
	{
		Blade blade=new Blade("7 clock",2);
		
		Trimmer trimmer=new Trimmer("Philips");
		trimmer.display();
		
		System.out.println("=======================");
		
		Trimmer trimmer1=new Trimmer("Panasonic");
		trimmer1.display();
		
		System.out.println("=======================");
		
		Trimmer trimmer2=new Trimmer("MI");
		trimmer2.display();
		
	}
	
}

