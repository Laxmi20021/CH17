class SimCard
{
	String company;
	double price;
	boolean activate;
	
	SimCard(String companyLocal,double priceLocal,boolean activateLocal)
	{
		company=companyLocal;
		price=priceLocal;
		activate=activateLocal;
		System.out.println("Creating SimCard using company,price,activate");
	}
	
}