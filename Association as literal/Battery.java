class Battery
{
	int capacity;
	
	Battery()
	{
		System.out.println("Created Airpod using no-args const..........");
	}
	Battery(int capacity)
	{
		this.capacity=capacity;
		System.out.println("Created Battery using int const");
	}
}