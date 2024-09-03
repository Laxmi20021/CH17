package com.xworkz.Tower.product;

public class Train {
	
	private int no;
	private String source;
	private String destination;
	
	public Train(int no)
	{
		this.no=no;
		System.out.println("running String const in Train");
		
	}
	
	public Train( String source) {
		super();
		
		this.source = source;
		System.out.println("running int , String , String const in Toothpaste");
		
	}
	public Train(int no , String source , String destination) {
		super();
		this.no = no;
		this.source = source;
		this.destination=destination;
		System.out.println("running int , String , String const in Toothpaste");
		
	}
	public void dispaly()
	{
		System.out.println("Display Train");
		System.out.println("no:"+this.no);
		System.out.println("source:"+this.source);
		System.out.println("destination:"+this.destination);
		
		
	}

}
