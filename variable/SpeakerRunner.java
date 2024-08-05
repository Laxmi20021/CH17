class SpeakerRunner{
	
	public static void main(String sound[]){
		
		Speaker speaker=new Speaker(12);
		speaker.setSpeaker(20,1000);
		speaker.print();
		
		
		
		Speaker speaker1=new Speaker(25);
		speaker1.brand="Sony";
		speaker1.setSpeaker(12,1500);
		speaker1.print();
		
		
		Speaker speaker2=new Speaker(15);
		speaker2.brand="Sound";
		speaker2.setSpeaker(9,2000);
		speaker2.print();
		
		Speaker speaker3=new Speaker(16);
		speaker3.brand="Sony";
		speaker3.setSpeaker(8,3000);
		speaker3.print();
		
		Speaker speaker4=new Speaker(17);
		speaker4.brand="Panasonic";
		speaker4.setSpeaker(7,1600);
		speaker4.print();
		
		Speaker speaker5=new Speaker(19);
		speaker5.brand="LG";
		speaker5.setSpeaker(10,1800);
		speaker5.print();
		
		
		
		
		
	}
	




}