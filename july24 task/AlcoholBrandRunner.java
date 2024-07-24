class AlcoholBrandRunner
{
	public static void main(String[] args)
	{
		System.out.println("start main in AlcoholBrandRunner");
		AlcoholBrand alcoholBrand=new AlcoholBrand();
		String name=alcoholBrand.name;
	    double price=alcoholBrand.price;
	    int quantity=alcoholBrand.quantity;
		
		
		System.out.println("alcoholBrand name:"+name);
		System.out.println("alcoholBrand price:"+price);
		System.out.println("alcoholBrand quantity:"+quantity);
		System.out.println("==============================");
		
		
		alcoholBrand.name="ABCDEF";
		alcoholBrand.price=170;
		alcoholBrand.quantity=650;
		
		
		System.out.println("alcoholBrand update name:"+alcoholBrand.name);
		System.out.println("alcoholBrand update price:"+alcoholBrand.price);
		System.out.println("alcoholBrand update quantity:"+alcoholBrand.quantity);
		System.out.println("end main in AlcoholBrand");
	}
}