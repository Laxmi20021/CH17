class Clip{
	String color;
	String type;
	Clip(String color,String type)  //con
	{
		this.color=color;
		this.type=type;
		
	}
	public void print()
	{
		System.out.println("Color:"+this.color);
		System.out.println("Type:"+this.type);
	}
}