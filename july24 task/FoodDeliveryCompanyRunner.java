class FoodDeliveryCompanyRunner
{
	public static void main(String[] args)
	{
		System.out.println("Start main in FoodDeliveryCompanyRunner");
		FoodDeliveryCompany fooddeliverycompany=new FoodDeliveryCompany(); //allocate ,copy ,invoke , return,default,
		
		double price=fooddeliverycompany.price;
		String location=fooddeliverycompany.location;
		String item=fooddeliverycompany.item;
		String deliveryboyname=fooddeliverycompany.deliveryboyname;
		
		System.out.println("fooddeliverycompany price:"+price);
        System.out.println("fooddeliverycompany location:"+location);
        System.out.println("fooddeliverycompany item:"+item);
		System.out.println("fooddeliverycompany deliveryboyname:"+deliveryboyname);
		
		fooddeliverycompany.price=250;
		fooddeliverycompany.location="Hosa road";
		fooddeliverycompany.item="Paulo";
		fooddeliverycompany.deliveryboyname="someone";
		
		System.out.println("fooddeliverycompany updated bikename:"+fooddeliverycompany.price);
		System.out.println("fooddeliverycompany updated location: "+fooddeliverycompany.location);
		System.out.println("fooddeliverycompany updated item:"+fooddeliverycompany.item);
		System.out.println("fooddeliverycompany updated price:"+fooddeliverycompany.deliveryboyname);
        System.out.println("======================");
		
		FoodDeliveryCompany fooddeliverycompany1=new FoodDeliveryCompany();
		fooddeliverycompany1.price=150;
		fooddeliverycompany1.location="Silk board";
		fooddeliverycompany1.item="Ghee Rice";
		fooddeliverycompany1.deliveryboyname="suga";
		
		System.out.println("FoodDeliveryCompany1 updated price:"+fooddeliverycompany1.price);
		System.out.println("FoodDeliveryCompany1 updated location:"+fooddeliverycompany1.location);
		System.out.println("fooddeliverycompany1 updated item:"+fooddeliverycompany1.item);
		System.out.println("FoodDeliveryCompany1 updated deliveryboyname:"+fooddeliverycompany1.deliveryboyname);
		
		
		System.out.println("End main in FoodDeliveryCompanyRunner");

	}
}