class Speaker{
	
	String brand="Samsung";
	double size;
	double cost;
	int output;
	
	public Speaker(int output){
		
		this.output=output;
    
	}
	
	public void setSpeaker(double size,double cost){
		
		this.size=size;
		this.cost=cost;
	}
	
	public void print(){
		System.out.println("Speaker brand:"+this.brand);
		System.out.println("Speaker size:"+this.size);
		System.out.println("Speaker cost:"+this.cost);
		System.out.println("Speaker output:"+this.output);
		System.out.println("----------------------");
	}
	
}