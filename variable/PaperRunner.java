class PaperRunner{
	
	public static void main(String[] args){
		
		Paper paper=new Paper(2.1);
		paper.setPaper("A2");
		paper.quality="good paper";
		paper.print();
		
		Paper paper1=new Paper(2.2);
		paper1.setPaper("A4");
		paper1.quality="grammage";
		paper1.print();
		
		
		Paper paper2=new Paper(2.3);
		paper2.setPaper("A5");
		paper2.quality="opacity";
		paper2.color="pink";
		paper2.print();
	}
	
}