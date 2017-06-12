package pack1;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Control {
	static JButton save;
	static JFrame windowControl;
	static ZeichnenControl drawControl;

	public Control() {

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
		drawControl.setBounds(0, 0, 300, 600);
		drawControl.setVisible(true);

		windowControl.add(save);

		windowControl.setVisible(false);

	}

}
