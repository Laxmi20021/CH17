class Laxmi
{
	String email;
	Clip clip;
	Laxmi(String email,Clip clip)
	{
		this.email=email;
		this.clip=clip;
	}
	public void result()
	{
		System.out.println("Email:"+this.email);
		this.clip.print();
	}
}