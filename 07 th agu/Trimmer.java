class Trimmer
{
	Blade blade;
	String brand;
	
	Trimmer(String brand, Blade blade)
	{
		this.brand=brand;
		this.blade=blade;
		System.out.println("Created Trimmer using String,blade");
	}
	
	public void display()
	{
		this.blade.details();
		System.out.println("Brand:"+this.brand);
		
	}
}

