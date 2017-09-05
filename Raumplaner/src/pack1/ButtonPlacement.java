package pack1;

public class ButtonPlacement {

	public static void placeGrundriss() {
		// 1 Zeile
		// Quadrat
		Grundriss.button[0].setBounds(50, 50, 125, 125);
		Grundriss.button[1].setBounds(175, 50, 125, 125);
		Grundriss.button[2].setBounds(300, 50, 125, 125);
		Grundriss.button[3].setBounds(425, 50, 125, 125);

		// 2 Zeile
		Grundriss.button[4].setBounds(50, 175, 125, 125);
		Grundriss.button[5].setBounds(175, 175, 125, 125);
		Grundriss.button[6].setBounds(300, 175, 125, 125);
		Grundriss.button[7].setBounds(425, 175, 125, 125);

		// 3 Zeile
		Grundriss.button[8].setBounds(50, 300, 125, 125);
		Grundriss.button[9].setBounds(175, 300, 125, 125);
		Grundriss.button[10].setBounds(300, 300, 125, 125);
		Grundriss.button[11].setBounds(425, 300, 125, 125);
		
		// 3 Zeile
		Grundriss.button[12].setBounds(50, 425, 125, 125);
		Grundriss.button[13].setBounds(175, 425, 125, 125);
		Grundriss.button[14].setBounds(300, 425, 125, 125);
	}
	
	public static void placeControl(){
		Room.objectButton[0].setBounds(820, 10, 100, 100);
		Room.objectButton[1].setBounds(930, 10, 100, 100);
		
		Room.objectButton[2].setBounds(820, 120, 100, 100);
		Room.objectButton[3].setBounds(930, 120, 100, 100);
		
		Room.objectButton[4].setBounds(820, 230, 100, 100);
		Room.objectButton[5].setBounds(930, 230, 100, 100);
		
		Room.objectButton[6].setBounds(820, 340, 100, 100);
		Room.objectButton[7].setBounds(930, 340, 100, 100);
		
	}

}
