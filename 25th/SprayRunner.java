class SprayRunner
{
	public static void main(String[] args)
	{
		
		System.out.println("Start main in SprayRunner");
		
		 Spray spray=new Spray();
		 spray.sprayType="hair spray";
		 spray.price=450;
		 int sprayQuantity=spray.sprayQuantity;
		 System.out.println("sprayType:"+spray.sprayType);
		 System.out.println("spray price:"+ spray.price);
		 System.out.println("sprayQuantity:"+sprayQuantity);
		 
		  Spray spray1=new Spray();
		 spray1.sprayType="hair spray";
		 spray1.price=450;
		  spray1.sprayQuantity=350;
		 System.out.println("updated sprayType:"+spray1.sprayType);
		 System.out.println("updated spray price:"+ spray1.price);
		 System.out.println("updated sprayQuantity:"+spray1.sprayQuantity);
		 
		 System.out.println("End main in SprayRunner");
	}
}