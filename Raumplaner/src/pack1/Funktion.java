package pack1;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class Funktion {
	
	static JFrame windowRaum, windowCode, windowControl;
	
	static int raumB, raumL;
	
	static JTextField code;

	static JButton save, submit;
	
	static Zeichnen draw;

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
		
		
		draw = new Zeichnen();
		draw.setBounds(0, 0, raumB, raumL);
		draw.setVisible(true);
		windowRaum.add(draw);
		
		
		
		
		
		
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
		
		submit = new JButton("Submit");
		submit.setBounds(200, 150, 100, 40);
		submit.setBackground(new Color(48, 120, 154));
		submit.setForeground(Color.WHITE);
		submit.setFocusPainted(false);
		submit.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				// Hash auswerten
			}

		});
		submit.setVisible(true);
		
		
		windowCode.add(submit);
		
		
		
		
		
		
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
		
		
		windowControl.add(save);
		
		windowControl.setVisible(true);
		
	}
}
