package pack1;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowStateListener;

import javax.swing.*;

public class Create {

	static JFrame windowStart;
	JPanel panel;
	JLabel label;
	JButton neu, load, form;
	
	public Create() {
		
		Var.stateZeichnen = 0;

		// JFrame

		windowStart = new JFrame("Wilkommen");
		windowStart.setSize(500, 300);
		windowStart.setResizable(false);
		windowStart.setLocationRelativeTo(null);
		windowStart.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		windowStart.setLayout(null);

		// Template Button

		load = new JButton("Vorlage");
		load.setBounds(275, 90, 145, 40);
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
		form.setBounds(75, 90, 145, 40);
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
		Var.draw.setBounds(0, 0, 500, 300);
		windowStart.add(Var.draw);

		windowStart.setVisible(true);
	}

}
