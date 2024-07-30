class CoilRunner
{
	public static void main(String[] args)
	
	{
		System.out.println("Start main in Coilrunner");
		
		Coil coil=new Coil("Maxo",1200);
		System.out.println("Coil brand:"+coil.brand);
		System.out.println("Coil cost:"+coil.cost);
		
		Coil coil1=new Coil("Good night",1800);
		System.out.println("Coil1 brand:"+coil1.brand);
		System.out.println("Coil1 cost:"+coil1.cost);
		
		Coil coil2=new Coil("Maxo",1500);
		System.out.println("Coil2 brand:"+coil2.brand);
		System.out.println("Coil2 cost:"+coil2.cost);
		
		Coil coil3=new Coil("Jumbo",1400);
		System.out.println("Coil3 brand:"+coil3.brand);
		System.out.println("Coil3 cost:"+coil3.cost);
		
		Coil coil4=new Coil("Odomos",1100);
		System.out.println("Coil4 brand:"+coil4.brand);
		System.out.println("Coil4 cost:"+coil4.cost);
		
		Coil coil5=new Coil("Relax",1000);
		System.out.println("Coil5 brand:"+coil5.brand);
		System.out.println("Coil5 cost:"+coil5.cost);
		
		
		
		System.out.println("End main in ColiRunner");
	}
}
