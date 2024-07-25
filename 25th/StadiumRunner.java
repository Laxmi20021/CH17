class StadiumRunner
{
	public static void main(String[] args)
	
	{
		System.out.println("Start main in Stadiumrunner");
		
		 Stadium stadium=new Stadium();
		 stadium.name="ram mandhir stadium";
		 stadium.location="5th block";
		 int size=stadium.size;
		 System.out.println("stadium name:"+stadium.name);
		 System.out.println("stadium location:"+stadium.location);
		 System.out.println(" stadium size:"+size);
		 Stadium stadium1=new Stadium();
		 stadium1.name="kartirava stadium";
		 stadium1.location="Nandini Layout";
		 stadium1.size=300;
		 System.out.println("stadium  updated name:"+stadium1.name);
		 System.out.println("stadium updated  location:"+stadium1.location);
		 System.out.println(" stadium updated size:"+stadium1.size);
		 
		 System.out.println("End main in StadiumRunner");
	}
}