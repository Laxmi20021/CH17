class States
{
	public static void value(String[] value)
	{
		System.out.println("start value in States");
		
		for(int position=0;position<value.length;position++)
			
			{
				String ref=value[position];
				System.out.println("Value:"+ref);
			}
			System.out.println("end value in States");
	}
}