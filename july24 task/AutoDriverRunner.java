class AutoDriverRunner
{
	public static void main(String[] args)
	{
		System.out.println("Start main in AutoDriverRunner");
		AutoDriver autodriver=new AutoDriver(); //allocate ,copy ,invoke , return,default,
		
		String drivername=autodriver.drivername;
		int age=autodriver.age;
		double salary=autodriver.salary;
		
		System.out.println("autodriver drivername:"+drivername);
        System.out.println("autodriver age:"+age);

		System.out.println("autodriver salary:"+salary);
		
		autodriver.drivername="ABC";
		autodriver.age=21;
		autodriver.salary=10000;
		
		System.out.println("autodriver updated drivername:"+autodriver.drivername);
		System.out.println("autodriver updated age: "+autodriver.age);
		System.out.println("autodriver updated salary:"+autodriver.salary);
        System.out.println("======================");
		
		AutoDriver autodriver1=new AutoDriver();
	    autodriver1.drivername="OBC";
		autodriver1.age=23;
		autodriver1.salary=3000;
		
		System.out.println("autodriver1 updated drivername:"+autodriver1.drivername);
		System.out.println("autodriver1 updated age:"+autodriver1.age);
		System.out.println("autodriver1 updated salary:"+autodriver1.salary);
		
		
		System.out.println("End main in AutoDriverRunner");

	}
}