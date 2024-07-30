class CapRunner
{
	public static void main(String[] args)
	
	{
		System.out.println("Start main in CapRunner");
		
		Cap cap=new Cap("Adidas",800,"laxmi");
		System.out.println("Cap brand:"+cap.brand);
		System.out.println("Cap price:"+cap.price);
        System.out.println("Cap name:"+cap.name);
		
		Cap cap1=new Cap("Sky",600,"lucky");
		System.out.println("Cap1 brand:"+cap1.brand);
		System.out.println("Cap1 price:"+cap1.price);
        System.out.println("Cap1 name:"+cap1.name);
		
		Cap cap2=new Cap("Barts",500,"Rohit");
		System.out.println("Cap2 brand:"+cap2.brand);
		System.out.println("Cap2 price:"+cap2.price);
        System.out.println("Cap2 name:"+cap2.name);
		
		Cap cap3=new Cap("ADHD",400,"Rakshit");
		System.out.println("Cap3 brand:"+cap3.brand);
		System.out.println("Cap3 price:"+cap3.price);
        System.out.println("Cap3 name:"+cap3.name);
		
		Cap cap4=new Cap("Bentley",300,"Yashoda");
		System.out.println("Cap4 brand:"+cap4.brand);
		System.out.println("Cap4 price:"+cap4.price);
        System.out.println("Cap4 name:"+cap4.name);
		
		Cap cap5=new Cap("Cap pins",200,"Raju");
		System.out.println("Cap5 brand:"+cap5.brand);
		System.out.println("Cap5 price:"+cap5.price);
        System.out.println("Cap5 name:"+cap5.name);
		
		System.out.println("End main in CapRunner");
	}
}