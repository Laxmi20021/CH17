class Vaishanvi
{
	long mobile;
	Knife knife;
	Vaishanvi(long mobile,Knife knife)
	{
		this.mobile=mobile;
		this.knife=knife;
	}
	public void result()
	{
		System.out.println("Mobile:"+mobile);
		this.knife.result();
	}
	
}