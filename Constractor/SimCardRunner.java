class SimCardRunner
{
	public static void main(String[] args)
	{
		System.out.println("start main in SimCardRunner");
		
		SimCard simCard=new SimCard("Jio",500,true);
		System.out.println("SimCard company:"+simCard.company);
		System.out.println("SimCard price:"+simCard.price);
		System.out.println("SimCard activate:"+simCard.activate);
		
		SimCard simCard1=new SimCard("Airtel",700,false);
		System.out.println("SimCard1 company:"+simCard1.company);
		System.out.println("SimCard1 price:"+simCard1.price);
		System.out.println("SimCard1 activate:"+simCard1.activate);
		
		SimCard simCard2=new SimCard("TataDocomo",400,true);
		System.out.println("SimCard2 company:"+simCard2.company);
		System.out.println("SimCard2 price:"+simCard2.price);
		System.out.println("SimCard2 activate:"+simCard2.activate);
		
		SimCard simCard3=new SimCard("Idea",500,true);
		System.out.println("SimCard3 company:"+simCard3.company);
		System.out.println("SimCard3 price:"+simCard3.price);
		System.out.println("SimCard3 activate:"+simCard3.activate);
		
		SimCard simCard4=new SimCard("Vodafone",900,false);
		System.out.println("SimCard4 company:"+simCard4.company);
		System.out.println("SimCard4 price:"+simCard4.price);
		System.out.println("SimCard4 activate:"+simCard4.activate);
		
		SimCard simCard5=new SimCard("BSNL",600,true);
		System.out.println("SimCard5 company:"+simCard5.company);
		System.out.println("SimCard5 price:"+simCard5.price);
		System.out.println("SimCard5 activate:"+simCard5.activate);
		
		SimCard simCard6=new SimCard("Reliance",400,true);
		System.out.println("SimCard6 company:"+simCard6.company);
		System.out.println("SimCard6 price:"+simCard6.price);
		System.out.println("SimCard6 activate:"+simCard6.activate);
		
		SimCard simCard7=new SimCard("Bharti",300,false);
		System.out.println("SimCard7 company:"+simCard7.company);
		System.out.println("SimCard7 price:"+simCard7.price);
		System.out.println("SimCard7 activate:"+simCard7.activate);
		
		SimCard simCard8=new SimCard("MTNL",500,false);
		System.out.println("SimCard8 company:"+simCard8.company);
		System.out.println("SimCard8 price:"+simCard8.price);
		System.out.println("SimCard8 activate:"+simCard8.activate);
		
		SimCard simCard9=new SimCard("Idea",500,true);
		System.out.println("SimCard9 company:"+simCard9.company);
		System.out.println("SimCard9 price:"+simCard9.price);
		System.out.println("SimCard9 activate:"+simCard9.activate);
		
		SimCard simCard10=new SimCard("VI",1000,true);
		System.out.println("SimCard10 company:"+simCard10.company);
		System.out.println("SimCard10 price:"+simCard10.price);
		System.out.println("SimCard10 activate:"+simCard10.activate);
		
		System.out.println("end main in SimCardRunner");
		
		
		
	}
}