class CharacterRunner
{
	public static void main(String[] character)
	{
		System.out.println("starting main in CharacterRunner");
		
		{
			char characters1='A';
			char characters2='B';
			char characters3='C';
			char characters4='D';
			char characters5='E';
			char characters6='G';
			char characters7='H';
			char characters8='I';
			char characters9='J';
			char characters10='K';
			
			int[] Character={characters1,characters2,characters3,characters4,characters5};
			
			
			int total=character.length;
			
			System.out.println("Total Number character:"+total);
			
			int  ref=Character[3]; 
			System.out.println("Element @ index 3:"+ref);
			
			int  ref1=Character[2]; 
			System.out.println("Element @ index 2:"+ref);
			
			int  ref2=Character[1]; 
			System.out.println("Element @ index 1:"+ref);
			
			int  ref3=Character[9]; 
			System.out.println("Element @ index 9:"+ref);
			
			int  ref4=Character[7]; 
			System.out.println("Element @ index 7:"+ref);
			
			int  ref5=Character[4]; 
			System.out.println("Element @ index 4:"+ref);
			
			int  ref6=Character[5]; 
			System.out.println("Element @ index 5:"+ref);
			
			int  ref7=Character[6]; 
			System.out.println("Element @ index 6:"+ref);
			
			int  ref8=Character[8]; 
			System.out.println("Element @ index 8:"+ref);
			
			int  ref9=Character[10]; 
			System.out.println("Element @ index 10:"+ref);
		}
	}
}