class ChocolateRunner{
	
	
	public static void main (String sweet[]){
		
		
		Chocolate chocolate=new Chocolate(50);
		chocolate.setChocolate("oreo");
		chocolate.size='s';
		chocolate.display();
		
		Chocolate chocolate1=new Chocolate(150);
		chocolate1.setChocolate("daily milk");
		chocolate1.size='l';
		chocolate1.display();
		chocolate1.brand="dairy milk";
		
		Chocolate chocolate2=new Chocolate(5);
		chocolate2.setChocolate("milky mist");
		chocolate2.size='m';
		chocolate2.display();
	}
}