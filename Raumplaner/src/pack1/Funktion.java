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
	static ZeichnenRaum drawRaum;
	static ZeichnenControl drawControl;

	public static void neuRaumSquare(){
		
		Var.windowRaumSquare.setVisible(true);
		
	}
	
	public static void openLoad(){
		
		Create.windowStart.setVisible(false);
		Var.windowCode.setVisible(true);
		
	}

	public static void neuControl() {
		
		Var.windowControl.setVisible(true);
		
	}

	public static void openForm(){
		
		Var.windowForm.setVisible(true);
		Create.windowStart.setVisible(false);
		
	}
}
