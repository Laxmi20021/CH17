class KeybunchRunner
{
	public static void main(String[] args)
	{
		Key key=new Key(5.6,"Godrej");
		Keybunch keybunch=new Keybunch("brass",key);
		keybunch.show();
		System.out.println("------------------------------------------------");
		Key key1=new Key(6.7,"Locker");
		Keybunch keybunch1=new Keybunch("Steel",key1);
		keybunch1.show();
		
	}
}