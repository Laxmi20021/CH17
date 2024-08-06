class Airpod
{
	String brand="Boat";
	Battery battery=new Battery(3);
	
	Airpod()
	{
		System.out.println("Created Airpod using no-args const..........");
	}
	
	public void torisu()
	{
		System.out.println("Brand:"+brand);
		System.out.println("Battery capacity:"+battery.capacity);
	}
}