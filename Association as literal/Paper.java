class Paper{
	
	double thickness;
	String size;
	String quality;
	String color="white";
	
	public Paper(double thickness){
		
		this.thickness=thickness;
	}
	
	public void setPaper(String size){
		
		this.size=size;
	}
	
	public void print(){
		
		System.out.println("paper thickness:"+thickness);
		System.out.println("paper size:"+size);
		System.out.println("paper quality:"+quality);
		System.out.println("paper color:"+color);
		System.out.println("--------------------------");
		
	}
	
}