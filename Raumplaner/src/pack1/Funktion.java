package pack1;

import java.awt.Color;
import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class Funktion {
	
	static JFrame windowRaum, windowControl;
	
	static JButton save;


	public static void neuRaumSquare(){
		new Room();
		Room.room.setVisible(true);
		Room.room.add(Var.draw);
	}
	

	public static void neuControl() {
		new Control();
		
		Control.windowControl.setVisible(true);
		Control.windowControl.add(Control.drawControl);
	}

	public static void openForm(){
		
		
		Var.stateZeichnen = 1;
		
		Create.windowStart.setVisible(false);
		
		new Grundriss();
		
		Grundriss.windowForm.setVisible(true);
		
		
		
		
	}
	
}
