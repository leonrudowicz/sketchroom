package pack1;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class Code {
	
	static JFrame windowCode;
	static JButton submitCode, backCode;
	static JTextField code;

	public Code() {
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
				
				System.out.println("Ja der Submit Button funktionier");
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
				Var.stateZeichnen = 0;
			}

		});
		backCode.setVisible(true);
		windowCode.add(backCode);

		windowCode.setVisible(false);
	}
}
