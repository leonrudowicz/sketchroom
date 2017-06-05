package pack1;

import java.awt.Color;
import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class Funktion {
	
	static JFrame windowRaum, windowCode, windowControl, windowLoad;
	
	static int raumB, raumL;
	
	static JTextField code;

	static JButton save, submitCode, submitForm;
	
	static ZeichnenRaum drawRaum;
	static ZeichnenControl drawControl;
	static ZeichnenForm drawForm;

	static JButton button[] = new JButton[16];
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
		
		windowCode = new JFrame("Optionen");
		windowCode.setSize(500, 300);
		windowCode.setResizable(false);
		windowCode.setLocationRelativeTo(null);
		windowCode.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		windowCode.setLayout(null);
		
		code = new JTextField("Hash-Code");
		code.setBounds(50, 100, 380, 40);
		windowCode.add(code);
		
		submitCode = new JButton("Submit");
		submitCode.setBounds(200, 150, 100, 40);
		submitCode.setBackground(new Color(48, 120, 154));
		submitCode.setForeground(Color.WHITE);
		submitCode.setFocusPainted(false);
		submitCode.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				// Hash auswerten
			}

		});
		submitCode.setVisible(true);
		windowCode.add(submitCode);

		
		windowCode.setVisible(true);
		
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

	public static void openForm() {
		
		Create.windowStart.setVisible(false);
		
		windowLoad = new JFrame("Form - Wähle deinen Grundriss");
		windowLoad.setSize(600, 600);
		windowLoad.setResizable(false);
		windowLoad.setLocationRelativeTo(null);
		windowLoad.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		windowLoad.setLayout(null);

		///////Buttons////////
		
		for(int i = 0; i<button.length; i++){
			button[i] = new JButton();
			button[i].setVisible(true);
			button[i].addActionListener(new ActionHandler());
			button[i].setFocusPainted(false);
			button[i].setContentAreaFilled(false);
			button[i].setBorder(null);
			windowLoad.add(button[i]);
		}
		
		ButtonPlacement.place();
		
		drawForm = new ZeichnenForm();
		drawForm.setBounds(0, 0, 600, 600);
		drawForm.setVisible(true);
		windowLoad.add(drawForm);
		
		
		//Quadrat 
		
		
		
		windowLoad.setVisible(true);
		
	}
}
