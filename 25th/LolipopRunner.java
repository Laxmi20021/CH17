class LolipopRunner
{
	public static void main(String[] args)
	{
		System.out.println("Start main in LolipopRunner");
		
		Lolipop lolipop=new Lolipop();
	    lolipop.brand="catberry";
	    lolipop.lolopopColor="choclate";
	    int l_quantity=lolipop.l_quantity;
	    System.out.println("lolipop brand:"+lolipop.brand);
	    System.out.println("lolipop lolopopColor:"+ lolipop.lolopopColor);
		System.out.println("lolipop l_quantity:"+l_quantity);
		 
		Lolipop lolipop1=new Lolipop();
	    lolipop1.brand="catberry";
	    lolipop1.lolopopColor="choclate";
	    lolipop1.l_quantity=4;
	    System.out.println("lolipop updated brand:"+lolipop1.brand);
	    System.out.println("lolipop updated  lolopopColor:"+ lolipop1.lolopopColor);
		System.out.println("lolipop  updated l_quantity:"+lolipop1.l_quantity);
		
		
		
		
		System.out.println("End main in LolipopRunner");
		
	}
}