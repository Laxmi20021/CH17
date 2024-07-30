class PrinterRunner
{
	public static void main(String[] args)
	{
		System.out.println("Start main in PrinterRunner");
		
		Printer printer=new Printer("HP");
		Printer printer1=new Printer("CROMA");
		Printer printer2=new Printer("LENOVA");
		Printer printer3=new Printer("DELL");
		Printer printer4=new Printer("APPLE");
		Printer printer5=new Printer("SAMSUNG");
		Printer printer6=new Printer("ABC");
		Printer printer7=new Printer("OM");
		Printer printer8=new Printer("BOSCH");
		Printer printer9=new Printer("ELECTRICS");
		Printer printer10=new Printer("XYZ");
		
		
		Board board=new Board(2.5,1200);
		Board board1=new Board(3.5,1400);
		Board board2=new Board(4.5,1500);
		Board board3=new Board(5.5,1600);
		Board board4=new Board(6.5,1700);
		Board board5=new Board(3.5,1400);
		Board board6=new Board(3.5,1400);
		Board board7=new Board(3.5,1400);
		Board board8=new Board(3.5,1400);
		Board board9=new Board(3.5,1400);
		Board board10=new Board(3.5,1400);
		
		
		Gold gold=new Gold(22,6917);
		Gold gold1=new Gold(21,5917);
		Gold gold2=new Gold(23,7917);
		Gold gold3=new Gold(24,8917);
		Gold gold4=new Gold(18,3917);
		Gold gold5=new Gold(20,4917);
		Gold gold6=new Gold(19,6917);
		Gold gold7=new Gold(19,7917);
		Gold gold8=new Gold(10,5917);
		Gold gold9=new Gold(15,4917);
		Gold gold10=new Gold(13,2917);
		
		System.out.println("End main in PrinterRunner");
	}
}
