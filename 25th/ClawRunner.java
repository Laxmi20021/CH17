class ClawRunner
{
	public static void main(String[] args)
	
	{
		System.out.println("Start main in ClawRunner");
		
		Claw claw=new Claw();
		String material=claw.material;
		claw.material="Hard";
		System.out.println("Claw material:"+material);
		System.out.println("Claw material:"+claw.material);
		
		double length=claw.length;
		claw.length=11;
		System.out.println("Claw length:"+length);
		System.out.println("Claw updated length:"+claw.length);
		
        boolean isSharp=claw.isSharp;
		claw.isSharp=true;
		System.out.println("Claw isSharp:"+isSharp);
		System.out.println("Claw updated:"+claw.isSharp);
		
		System.out.println("=======================================");
		
		Claw claw1=new Claw();
		claw1.material="Soft";
		System.out.println("Claw updated material:"+claw1.material);
	
	    claw.length=14;
		System.out.println("Claw updated length:"+claw.length);
		
				
		
		
		System.out.println("End main in ClawRunner");
		
	}
}