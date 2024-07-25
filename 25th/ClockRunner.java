class ClockRunner
{
	public static void main(String[] args)
	
	{
		System.out.println("Start main in ClockRunner");
		
	   Clock clock=new Clock();
	   clock.clockCompany="Sonata";
	   clock.price=2500;
	   int clockHands=clock.clockHands;
	   System.out.println("clock company:"+clock.clockCompany);
	   System.out.println("clock price:"+ clock.price);
	   System.out.println("clock hands:"+clockHands);
	   Clock clock1=new Clock();
	   clock1.clockCompany="quartz";
	   clock1.price=1500;
	   clock1.clockHands=3;
	   System.out.println("clock company:"+clock1.clockCompany);
	   System.out.println("clock price:"+ clock1.price);
	   System.out.println("clock hands:"+clock1.clockHands);
	}
}