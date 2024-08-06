class Driver{
	
	String name;
	String licenseNo;
	int age;
	
	Driver(){
		System.out.println("Created battery using arg const");
	}
	
	Driver(String name,String licenseNo,int age){
		this.name=name;
		this.licenseNo=licenseNo;
		this.age=age;
		System.out.println("Created Driver using String,String and int const");
	}
	
	public  void torisu()
	{
		System.out.println("Name:"+name);
		System.out.println("Age:"+age);
		System.out.println("LincenceNo:"+licenseNo);
		
		
	}
}