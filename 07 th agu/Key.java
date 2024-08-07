class Key
{
	double weight;
	String brand;
	Key(double weight,String brand)
	{
		this.weight=weight;
		this.brand=brand;
	}
	public void print()
	{
		System.out.println("Weight:"+this.weight);
		System.out.println("Brand:"+this.brand);
	}
}