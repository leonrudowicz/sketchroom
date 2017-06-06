package pack1;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class Var {
	static JButton button[] = new JButton[16];
	static JButton submitCode, backForm, backCode;
	static JFrame windowForm, windowCode;
	static JTextField code;
	ZeichnenForm drawForm;

	public Var() {
		//////////////////////////////////////////////////////////////// WINDOW FORM //////////////////////////////////////////////

		// Add Window Form
		windowForm = new JFrame("Form - Wähle deinen Grundriss");
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
		drawForm = new ZeichnenForm();
		drawForm.setBounds(0, 0, 600, 600);
		drawForm.setVisible(true);
		windowForm.add(drawForm);

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

		// Quadrat

		windowForm.setVisible(false);

		//////////////////////////////////////////////////////////////////// WINDOW CODE///////////////////////////////////////////////////////////////
		
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
		
		////////////////////////////////////////// QUADRAT //////////////////////////////////////
		
		

	}

}
