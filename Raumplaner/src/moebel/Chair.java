package moebel;


public class Chair {
	static public int laenge, breite, posX, posY, chairCount = 0;
	
	public Chair(int l, int b, int x, int y) {
		//Default
		laenge = 100;
		breite = 100;
		posX = x;
		posY = y;
		
		System.out.println("Chair");
		System.out.println(laenge);
		System.out.println(breite);
		System.out.println(posX);
		System.out.println(posY);
		
	}
	
	public static boolean draw(){
		chairCount++;
		return true;
		
	}
		

}
