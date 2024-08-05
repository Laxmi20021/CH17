class RocketRunner{
	
	
	public static void main(String fly[]){
		
		Rocket rocket=new Rocket(180);
		rocket.noOfTrusters=5;
		rocket.setRocket(300);
		rocket.show();
		
		Rocket rocket1=new Rocket(200);
		rocket1.country="USA";
		rocket1.noOfTrusters=7;
		rocket1.setRocket(400);
		rocket1.show();
		
		
		Rocket rocket2=new Rocket(150);
		rocket2.country="Germany";
		rocket2.noOfTrusters=2;
		rocket2.setRocket(500);
		rocket2.show();
		
		Rocket rocket3=new Rocket(170);
		rocket3.country="UK";
		rocket3.noOfTrusters=1;
		rocket3.setRocket(600);
		rocket3.show();
		
		Rocket rocket4=new Rocket(190);
		rocket4.country="Africa";
		rocket4.noOfTrusters=3;
		rocket4.setRocket(800);
		rocket4.show();
		
		
	}


}