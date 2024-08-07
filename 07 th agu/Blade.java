class Blade
{
	String brand;
	double price;
	
	public Blade(String brand,double price)
	{
		this.brand=brand;
		this.price=price;
		
		System.out.println("Brand:"+this.brand);
		System.out.println("Price:"+this.price);
	}
	public void details()
	{
		System.out.println("Brand:"+brand);
	}
}