class TvRunner
{
	public static void main(String[] args)
	
	{
		System.out.println("Start main in TvRunner");
		
		Tv tv=new Tv();
		double cost=tv.makingCost;	
		tv.makingCost=15200;
		System.out.println("Tv updated Cost:"+tv.makingCost);
		
		int warranty=tv.warranty;
		warranty=2;
		System.out.println("Updated Tv Warranty:"+warranty);
		
		Tv tv1=new Tv();
		System.out.println("Tv1 makingCost:"+tv1.makingCost);
		System.out.println("Tv Warranty:"+tv.warranty);
		System.out.println("End main in TvRunner");
		
		
		
	}
}