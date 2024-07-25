class JeanRunner2
{
	public static void main(String[] args)
	{
		Jean jean=null;
		
		System.out.println("jean:"+jean);//System.out.println("jean:"+jean.price);NullPointerException
		System.out.println("jean:"+jean.price);
		// null is keyword
		//non-primitive
		//ref is not pointing to any location
		
		jean=new Jean();
		
		
	}
}
