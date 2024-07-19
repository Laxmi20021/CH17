class CementRunner
{
	public static void main(String[] args)
	{
		
		System.out.println("Start main CementRunner");
		
		String[] cement={"Ambuja","Penna","JSW","ACC","Ultratech"};
		//for(int brand=0;brand<=5;brand++)
			for (int brand=0;brand<cement.length;brand++)
		{
			String ref=cement[brand];
			System.out.println("Cement:"+ref);
			//System.out.println("company:"+cement[brand]);
		}
		
		System.out.println("end main in CementRunner");
	}
}