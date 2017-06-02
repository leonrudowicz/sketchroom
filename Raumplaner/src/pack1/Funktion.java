package pack1;

import javax.swing.JFrame;

public class Funktion {
	
	static JFrame raum;
	static int raumB = 100;
	static int raumL= 100;
	
	static JFrame options;
	

	public static void neuRaum(){
		// Werte bekommen 
		
		raumB = Create.breiteInput;
		raumL = Create.längeInput;
		
		
		
		Create.window.setVisible(false);
		
		raum = new JFrame("Room");
		raum.setSize(raumB, raumL);
		raum.setResizable(false);
		raum.setLocationRelativeTo(null);
		raum.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		raum.setVisible(true);
	}
	
	public static void openOptions(){
		Create.window.setVisible(false);
		
		options = new JFrame("Optionen");
		options.setSize(500, 300);
		options.setResizable(false);
		options.setLocationRelativeTo(null);
		options.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		options.setVisible(true);
		
	}
}
