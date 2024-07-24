class RapidoRunner
{
	public static void main(String[] args)
	{
		System.out.println("Start main in RapidoRunner");
		Rapido rapido=new Rapido(); //allocate ,copy ,invoke , return,default,
		
		String bikename=rapido.bikename;
		String location=rapido.location;
		double price=rapido.price;
		
		System.out.println("rapido bikename:"+bikename);
        System.out.println("rapido location:"+location);

		System.out.println("rapido price:"+price);
		
		rapido.bikename="Passionpro";
		rapido.location="Hosa road";
		rapido.price=250;
		
		System.out.println("rapido updated bikename:"+rapido.bikename);
		System.out.println("rapido updated location: "+rapido.location);
		System.out.println("rapido updated price:"+rapido.price);
        System.out.println("======================");
		
		Rapido rapido1=new Rapido();
		rapido1.bikename="Bullet";
		rapido1.location="Silk board";
		rapido1.price=300;
		
		System.out.println("Rapido1 updated bikename:"+rapido1.bikename);
		System.out.println("Rapido1 updated location:"+rapido1.location);
		System.out.println("Rapido1 updated price:"+rapido1.price);
		
		
		System.out.println("End main in RapidoRunner");

	}
}