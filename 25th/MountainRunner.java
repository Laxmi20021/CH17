class MountainRunner
{
	public static void main(String[] args)
	
	{
		
		 System.out.println("Start main in MountainRunner");
		 
		 Mountain mountain=new Mountain();
		 mountain.mountainType="Fold mountains";
		 mountain.height=150;
		 boolean isAtRiver=mountain.isAtRiver;
		 System.out.println(" mountainType:"+mountain.mountainType);
		 System.out.println(" height:"+mountain.height);
		 System.out.println(" isAtRiver:"+isAtRiver);
		 Mountain mountain1=new Mountain();
		 mountain1.mountainType="Valcano mountains";
		 mountain1.height=250;
		  mountain1.isAtRiver=false;
		 System.out.println(" mountanType updated:"+mountain1.mountainType);
		 System.out.println(" height updated:"+mountain1.height);
		 System.out.println(" isAtRiver updated:"+mountain1.isAtRiver);
		 
		 System.out.println("End main in MountainRunner");
	}
}