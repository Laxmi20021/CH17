class MatrimonyRunner
{
	public static void main(String[] args)
	{
		System.out.println("start main in MatrimonyRunner");
		Matrimony matrimony=new Matrimony();
		String name=matrimony.name;
		String caste=matrimony.caste;
		String town=matrimony.town;
		
		System.out.println("matrimony name:"+name);
		System.out.println("matrimony caste:"+caste);
		System.out.println("matrimony town:"+town);
		System.out.println("========================");
		
		matrimony.name="Anu";
		matrimony.caste="Lingayat";
		matrimony.town="koppal";
		
		System.out.println("matrimony name updated:"+matrimony.name);
		System.out.println("matrimony caste updated:"+matrimony.caste);
		System.out.println("matrimony town updated:"+matrimony.town);
		
		System.out.println("end main in MatrimonyRunner");
	}
}