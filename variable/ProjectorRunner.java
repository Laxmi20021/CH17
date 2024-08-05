class ProjectorRunner{
	
	public static void main(String project[]){
		
		Projector projector=new Projector("dell");
		projector.setProjector("white");
		projector.weight=15;
		projector.print();
		
		Projector projector1=new Projector("Samsung");
		projector1.setProjector("cream");
		projector1.weight=20;
		projector1.type="Laser";
		projector1.print();
		
		Projector projector2=new Projector("hp");
		projector2.setProjector("black");
		projector2.weight=20;
		projector2.print();
	}

}