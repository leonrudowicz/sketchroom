package pack1;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Funktion {
	
	static JFrame windowRaum, windowControl;
	
	static JButton save;


	public static void neuRaumSquare(){
		Room.room.setVisible(true);
		Room.room.add(Var.draw);
	}
	

	public static void openForm(){
		
		
		Var.stateZeichnen = 1;
		
		Create.windowStart.setVisible(false);
		
		
		Grundriss.windowForm.setVisible(true);
		
		
		
		
	}
	
}
