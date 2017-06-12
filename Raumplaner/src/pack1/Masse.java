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
	static JButton neu;
	static int breiteInput, laengeInput;
	static String userInputL, userInputB;

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
				Masse.windowMasse.setVisible(false);

				Room.room.setSize(breiteInput, laengeInput);

				Var.stateZeichnen = 3;
				Var.draw.setBounds(0, 0, breiteInput, laengeInput);

			}

		});
		windowMasse.add(neu);
	}

}
