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
	JButton neu, form, submitCode;
	JTextField code;

	public Create() {

		Var.stateZeichnen = 0;

		// JFrame

		windowStart = new JFrame("Wilkommen");
		windowStart.setSize(500, 300);
		windowStart.setResizable(false);
		windowStart.setLocationRelativeTo(null);
		windowStart.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		windowStart.setLayout(null);

		// Form

		form = new JButton("Neuer Raum");
		form.setBounds(170, 100, 140, 40);
		form.setVisible(true);
		form.setBackground(new Color(31, 67, 135));
		form.setForeground(Color.WHITE);
		form.setFocusPainted(false);
		form.setToolTipText("Erstelle einen neuen Raum, bestimme dafür zuerst deinen Grundriss.");
		form.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				Funktion.openForm();
			}

		});
		windowStart.add(form);

		// Hash
		code = new JTextField("Hash-Code");
		code.setBounds(50, 170, 380, 40);
		windowStart.add(code);

		submitCode = new JButton("Submit");
		submitCode.setBounds(200, 220, 100, 40);
		submitCode.setBackground(new Color(31, 67, 135));
		submitCode.setForeground(Color.WHITE);
		submitCode.setFocusPainted(false);
		submitCode.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				// Hash auswerten

				System.out.println("Ja der Submit Button funktioniert");
			}

		});
		submitCode.setVisible(true);
		windowStart.add(submitCode);

		Var.draw.setBounds(0, 0, 500, 300);
		windowStart.add(Var.draw);

		windowStart.setVisible(true);
	}

}
