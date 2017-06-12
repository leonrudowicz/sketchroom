package pack1;

import java.awt.Color;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class Var {
	static JButton button[] = new JButton[16];
	static JButton submitCode, backForm, backCode, neu, save;
	static JFrame windowForm, windowCode, windowMasse, windowRaumSquare, windowControl;
	static JTextField code, rot, blue, orange, magenta;
	ZeichnenRaum drawRaum;
	static Zeichnen draw;
	ZeichnenControl drawControl;
	static int breiteInput, laengeInput, stateZeichnen;
	static String userInputL, userInputB;

	public Var() {

		///////////// WINDOW CODE///////////////////////

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

		backCode = new JButton("Back");
		backCode.setBounds(100, 150, 100, 40);
		backCode.setBackground(new Color(48, 120, 154));
		backCode.setForeground(Color.WHITE);
		backCode.setFocusPainted(false);
		backCode.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				windowCode.setVisible(false);
				Create.windowStart.setVisible(true);
			}

		});
		backCode.setVisible(true);
		windowCode.add(backCode);

		windowCode.setVisible(false);

		/////////////////// Mass Eingabe///////////

		windowMasse = new JFrame("Masse bestimmen");
		windowMasse.setSize(600, 300);
		windowMasse.setResizable(false);
		windowMasse.setLocationRelativeTo(null);
		windowMasse.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		windowMasse.setLayout(null);
		windowMasse.setVisible(false);

		// Bestimmung und Add von Textfeld auf Frame

		rot = new JTextField("Breite");
		rot.setForeground(Color.red);
		rot.setBounds(50, 100, 145, 40);

		blue = new JTextField("Laenge");
		blue.setForeground(Color.blue);
		blue.setBounds(50, 50, 145, 40);

		orange = new JTextField("Laenge");
		orange.setForeground(Color.orange);
		orange.setBounds(200, 50, 145, 40);

		magenta = new JTextField("lol");
		magenta.setForeground(Color.magenta);
		magenta.setBounds(200, 100, 145, 40);

		System.out.println(stateZeichnen);
		if (Var.stateZeichnen == 2) {
			draw = new Zeichnen();
			draw.setVisible(true);
			draw.setBounds(0, 0, 600, 300);
			windowMasse.add(draw);

		}

		neu = new JButton("Neuer Raum");
		neu.setBounds(50, 150, 145, 40);
		neu.setVisible(true);
		neu.setBackground(new Color(48, 120, 154));
		neu.setForeground(Color.WHITE);
		neu.setFocusPainted(false);
		neu.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				userInputB = rot.getText();
				breiteInput = Integer.parseInt(userInputB);

				userInputL = blue.getText();
				laengeInput = Integer.parseInt(userInputL);

				Funktion.neuRaumSquare();
				Funktion.neuControl();
				Var.windowMasse.setVisible(false);

				windowRaumSquare.setSize(breiteInput, laengeInput);
				drawRaum.setBounds(0, 0, breiteInput, laengeInput);

			}

		});
		windowMasse.add(neu);

		

		//////////////////////////////// Control////////////////////////////////

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
		drawControl.setBounds(0, 0, 20, 20);
		drawControl.setVisible(true);
		windowControl.add(drawControl);

		windowControl.add(save);

		windowControl.setVisible(false);

	}

	public static void createForm() {
		/////////////////////////// WINDOW FORM/////////////

		// Add Window Form
		windowForm = new JFrame("Form - Waehle deinen Grundriss");
		windowForm.setSize(600, 600);
		windowForm.setResizable(false);
		windowForm.setLocationRelativeTo(null);
		windowForm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		windowForm.setLayout(null);

		/////// Buttons////////

		for (int i = 0; i < button.length; i++) {
			button[i] = new JButton();
			button[i].setVisible(true);
			button[i].addActionListener(new ActionHandler());
			button[i].setFocusPainted(false);
			button[i].setContentAreaFilled(false);
			button[i].setBorder(null);
			windowForm.add(button[i]);
		}
		// Place Buttons
		ButtonPlacement.place();

		// Add draw Funktion

		draw = new Zeichnen();

		if (Var.stateZeichnen == 1) {
			draw.setBounds(0, 0, 600, 600);
			draw.setVisible(true);
			windowForm.add(draw);

		}

		// Back Button
		backForm = new JButton("Back");
		backForm.setBounds(425, 425, 125, 125);
		backForm.setBackground(new Color(48, 120, 154));
		backForm.setForeground(Color.WHITE);
		backForm.setFocusPainted(false);
		backForm.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				windowForm.setVisible(false);
				Create.windowStart.setVisible(true);
			}

		});
		backForm.setVisible(true);
		windowForm.add(backForm);

		windowForm.setVisible(false);
	}
	
	public static void createMasse(){
		
		
	}
}
