package pack1;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class Masse {
	static JFrame windowMasse;
	static JTextField rot, blue, orange, magenta;
	static JButton neuSquare, neuRechtsOben, masseBack;
	static int breiteInput, laengeInput, breite2Input, laenge2Input;
	static String userInputL, userInputB, userInputL2, userInputB2;

	public Masse() {
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

		orange = new JTextField("Laenge 2");
		orange.setForeground(Color.orange);
		orange.setBounds(200, 50, 145, 40);

		magenta = new JTextField("Breite 2");
		magenta.setForeground(Color.magenta);
		magenta.setBounds(200, 100, 145, 40);

		Var.draw.setVisible(true);
		Var.draw.setBounds(0, 0, 600, 300);
		windowMasse.add(Var.draw);
		
		masseBack = new JButton("Back");
		masseBack.setBounds(460, 210, 90, 40);
		masseBack.setBackground(new Color(48, 120, 154));
		masseBack.setForeground(Color.WHITE);
		masseBack.setFocusPainted(false);
		masseBack.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Var.stateZeichnen = 1;
				windowMasse.setVisible(false);
				Grundriss.windowForm.setVisible(true);
			}

		});
		masseBack.setVisible(true);
		windowMasse.add(masseBack);
		
		//Neuer Raum für Square 
		neuSquare = new JButton("Neuer Raum");
		neuSquare.setBounds(50, 150, 145, 40);
		neuSquare.setBackground(new Color(48, 120, 154));
		neuSquare.setForeground(Color.WHITE);
		neuSquare.setFocusPainted(false);
		neuSquare.setVisible(false);
		neuSquare.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				userInputB = rot.getText();
				breiteInput = Integer.parseInt(userInputB);

				userInputL = blue.getText();
				laengeInput = Integer.parseInt(userInputL);

				Funktion.neuRaumSquare();
				Funktion.neuControl();
				Masse.windowMasse.setVisible(false);

				Room.room.setSize(Masse.breiteInput + 6, Masse.laengeInput + 29);

				Var.stateZeichnen = 3;
				Var.draw.setBounds(0, 0, breiteInput, laengeInput);

			}

		});
		windowMasse.add(neuSquare);
		
		//Neuer Raum für RechtsOben
		neuRechtsOben = new JButton("Neuer Raum");
		neuRechtsOben.setBounds(125, 150, 145, 40);
		neuRechtsOben.setBackground(new Color(48, 120, 154));
		neuRechtsOben.setForeground(Color.WHITE);
		neuRechtsOben.setFocusPainted(false);
		neuRechtsOben.setVisible(false);
		neuRechtsOben.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
				userInputB = rot.getText();
				breiteInput = Integer.parseInt(userInputB);

				userInputL = blue.getText();
				laengeInput = Integer.parseInt(userInputL);
				
				userInputB2 = magenta.getText();
				breite2Input = Integer.parseInt(userInputB2);

				userInputL2 = orange.getText();
				laenge2Input = Integer.parseInt(userInputL2);
				
				Funktion.neuControl(); 
				Masse.windowMasse.setVisible(false);
				Funktion.neuRaumSquare();
				
				Var.stateZeichnen = 5;
				Var.draw.setBounds(0, 0, breiteInput, laengeInput);
				

			}

		});
		windowMasse.add(neuRechtsOben);
	}

}
