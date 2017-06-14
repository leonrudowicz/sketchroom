package pack1;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Grundriss {
	static JFrame windowForm;
	static JButton button[] = new JButton[16];
	static Zeichnen draw;
	static JButton backForm;

	public Grundriss() {
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
		draw.setBounds(0, 0, 600, 600);
		draw.setVisible(true);
		windowForm.add(draw);

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
				Var.stateZeichnen = 0;
			}

		});
		backForm.setVisible(true);
		windowForm.add(backForm);

		windowForm.setVisible(false);
	}
}
