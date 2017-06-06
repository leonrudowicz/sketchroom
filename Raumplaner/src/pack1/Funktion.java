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
	
	static int raumB, raumL;
	
	static JButton save;
	static ZeichnenRaum drawRaum;
	static ZeichnenControl drawControl;

	public static void neuRaum(){
		
		// Werte bekommen 
		raumB = Create.breiteInput;
		raumL = Create.längeInput;
		
		
		
		Create.windowStart.setVisible(false);
		
		windowRaum = new JFrame("Room");
		windowRaum.setSize(raumB, raumL);
		windowRaum.setResizable(false);
		windowRaum.setLocationRelativeTo(null);
		windowRaum.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		windowRaum.setLayout(null);
		
		drawRaum = new ZeichnenRaum();
		drawRaum.setBounds(0, 0, raumB, raumL);
		drawRaum.setVisible(true);
		windowRaum.add(drawRaum);
		
		windowRaum.setVisible(true);
	}
	
	public static void openLoad(){
		
		Create.windowStart.setVisible(false);
		Var.windowCode.setVisible(true);
		
	}

	public static void neuControl() {
		
		windowControl = new JFrame("Control");
		windowControl.setSize(300, 600);
		windowControl.setResizable(false);
		windowControl.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		windowControl.setLayout(null);
		
		save = new JButton("Save");
		save.setBounds(80, 450, 100, 40);
		save.setVisible(true);
		save.setBackground(new Color(48, 120, 154));
		save.setForeground(Color.WHITE);
		save.setFocusPainted(false);
		save.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				// Hash dings hier
			}

		});
		drawControl = new ZeichnenControl();
		drawControl.setBounds(0, 0, raumB, raumL);
		drawControl.setVisible(true);
		windowControl.add(drawControl);
		
		windowControl.add(save);
		
		windowControl.setVisible(true);
		
	}

	public static void openForm(){
		
		Var.windowForm.setVisible(true);
		Create.windowStart.setVisible(false);
		
	}
}
