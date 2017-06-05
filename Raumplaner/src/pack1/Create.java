package pack1;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Create {

	static JFrame windowStart;
	JPanel panel;
	JLabel label;
	JButton neu, load, form;
	JTextField breite, länge;

	static String userInputL, userInputB;

	static int breiteInput, längeInput;

	public Create() {

		// JFrame

		windowStart = new JFrame("Create Room");
		windowStart.setSize(500, 300);
		windowStart.setResizable(false);
		windowStart.setLocationRelativeTo(null);
		windowStart.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		windowStart.setLayout(null);

		// Neuer Raum Button

		neu = new JButton("Neuer Raum");
		neu.setBounds(50, 150, 145, 40);
		neu.setVisible(true);
		neu.setBackground(new Color(48, 120, 154));
		neu.setForeground(Color.WHITE);
		neu.setFocusPainted(false);
		neu.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				userInputB = breite.getText();
				breiteInput = Integer.parseInt(userInputB);

				userInputL = länge.getText();
				längeInput = Integer.parseInt(userInputL);

				Funktion.neuRaum();
				Funktion.neuControl();
			}

		});
		windowStart.add(neu);

		// Bestimmung und Add von Textfeld auf Frame
		breite = new JTextField("Breite");
		breite.setBounds(50, 100, 145, 40);

		länge = new JTextField("Länge");
		länge.setBounds(50, 50, 145, 40);

		windowStart.add(breite);
		windowStart.add(länge);

		// Template Button

		load = new JButton("Vorlage");
		load.setBounds(250, 150, 145, 40);
		load.setVisible(true);
		load.setBackground(new Color(48, 120, 154));
		load.setForeground(Color.WHITE);
		load.setFocusPainted(false);
		load.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				Funktion.openLoad();
			}

		});
		windowStart.add(load);
		
		// Form
		
		form = new JButton("Form");
		form.setBounds(250, 50, 145, 40);
		form.setVisible(true);
		form.setBackground(new Color(48, 120, 154));
		form.setForeground(Color.WHITE);
		form.setFocusPainted(false);
		form.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				Funktion.openForm();
			}

		});
		windowStart.add(form);

		windowStart.setVisible(true);
	}

}
