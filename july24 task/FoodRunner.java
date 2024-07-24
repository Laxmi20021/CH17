class FoodRunner
{
	public static void main(String[] args)
	{
		System.out.println("start main in FoodRunner");
		Food food=new Food();
		String name=food.name;
		String ingredients=food.ingredients;
	    double price=food.price;
		
		
		System.out.println("food name:"+name);
		System.out.println("food ingredients:"+ingredients);
		System.out.println("food price:"+price);
		System.out.println("==============================");
		
		
		food.name="Dosa";
		food.ingredients="Rice";
		food.price=50;
		
		
		System.out.println("food update name:"+food.name);
		System.out.println("food update ingredients:"+food.ingredients);
		System.out.println("food update price:"+food.price);
		System.out.println("end main in FoodRunner");
	}
}