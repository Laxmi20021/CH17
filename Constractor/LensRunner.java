class LensRunner
{
	public static void main(String[] args)
	{
		System.out.println("Start main in LensRunner");
		
		Lens lens=new Lens("Wise lens",1200);
		System.out.println("Lens brand:"+lens.brand);
		System.out.println("Lens price:"+lens.price);
		
		Lens lens1=new Lens("Alluring lens",1600);
		System.out.println("Lens1 brand:"+lens1.brand);
		System.out.println("Lens1 price:"+lens1.price);
		
		Lens lens2=new Lens("Striking lens",1800);
		System.out.println("Lens2 brand:"+lens2.brand);
		System.out.println("Lens2 price:"+lens2.price);
		
		Lens lens3=new Lens("Fresh lens",1600);
		System.out.println("Lens3 brand:"+lens3.brand);
		System.out.println("Lens3 price:"+lens3.price);
		
		Lens lens4=new Lens("Passionate lens",2000);
		System.out.println("Lens4 brand:"+lens4.brand);
		System.out.println("Lens4 price:"+lens4.price);
		
		Lens lens5=new Lens("Optix lens",2500);
		System.out.println("Lens5 brand:"+lens5.brand);
		System.out.println("Lens5 price:"+lens5.price);
		
		
		System.out.println("End main in LensRunner");
	}
}