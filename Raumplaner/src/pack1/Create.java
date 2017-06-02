package pack1;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Create {

	static JFrame window;
	JPanel panel;
	JLabel label;
	JButton neu;
	JButton template;
	JTextField breite;
	JTextField l�nge;

	static String userInputL;
	static String userInputB;

	static int breiteInput;
	static int l�ngeInput;

	public Create() {
		
		//JFrame

		window = new JFrame("Create Room");
		window.setSize(500, 300);
		window.setResizable(false);
		window.setLocationRelativeTo(null);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setLayout(null);

		//Neuer Raum Button

		neu = new JButton("Neuer Raum");
		neu.setBounds(40, 150, 145, 40);
		neu.setVisible(true);
		neu.setBackground(new Color(48, 120, 154));
		neu.setForeground(Color.WHITE);
		neu.setFocusPainted(false);
		neu.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				userInputB = breite.getText();
				breiteInput = Integer.parseInt(userInputB);

				userInputL = l�nge.getText();
				l�ngeInput = Integer.parseInt(userInputL);

				Funktion.neuRaum();
			}

		});
		window.add(neu);
		
		//Bestimmung und Add von Textfeld auf Frame
		breite = new JTextField("Breite");
		breite.setBounds(40, 100, 145, 40);

		l�nge = new JTextField("L�nge");
		l�nge.setBounds(40, 50, 145, 40);

		window.add(breite);
		window.add(l�nge);
		
		//Template Button
		
		template = new JButton("Vorlage");
		template.setBounds(250, 150, 145, 40);
		template.setVisible(true);
		template.setBackground(new Color(48, 120, 154));
		template.setForeground(Color.WHITE);
		template.setFocusPainted(false);
		template.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				Funktion.openOptions();
			}

		});
		window.add(template);
		
		
		
		window.setVisible(true);
	}

}
