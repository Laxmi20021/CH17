class AdharRunner
{
	public static void main(String[] nos)
	{
		System.out.println("starting main in AdharRunner");
		
		long harshitaAdharNo=475645821258L;
		long ranjithaAdharNo=475612584593L;
		long harshitaBnAdharNo=143045821258L;
		long ashwiniAdharNo=125675861122L;
		
		long sachinAdharNo=122345561258L;
		
		long[] adharNumber={harshitaAdharNo,ranjithaAdharNo,harshitaBnAdharNo,ashwiniAdharNo,sachinAdharNo};
		
		int number=adharNumber.length; 
		System.out.println("Total number of adhar No :"+number);
		
		
		long ref=adharNumber[2];
		System.out.println("Element @ index 2:"+ref);
		
		long ref1=adharNumber[1];
		System.out.println("Element @ index 1:"+ref);
		
		long ref2=adharNumber[5];
		System.out.println("Element @ index 2:"+ref);
	}
}