class Chocolate{
	
	String brand="nestle";
	double price;
	String flavour;
	char size;
	
	public Chocolate(double price){
		
		this.price=price;
	}
	
	public void setChocolate(String flavour){
		
		this.flavour=flavour;
	}
	public void display(){
		
		System.out.println("chocolate brand:"+brand);
		System.out.println("chocolate price:"+price);
		System.out.println("chocolate flavour:"+flavour);
		System.out.println("chocolate size:"+size);
		System.out.println("--------------------------");
		
	}
	

}