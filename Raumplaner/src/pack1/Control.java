package pack1;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Control {
	static JButton save;
	static JFrame windowControl;
	static ZeichnenControl drawControl;
	static JButton objectButton[] = new JButton[16];

	public Control() {

		windowControl = new JFrame("Control");
		windowControl.setSize(300, 600);
		windowControl.setResizable(false);
		windowControl.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		windowControl.setLayout(null);

		for (int i = 0; i < objectButton.length; i++) {
			objectButton[i] = new JButton();
			objectButton[i].setVisible(true);
			objectButton[i].addActionListener(new ActionHandler());
			objectButton[i].setFocusPainted(false);
			objectButton[i].setContentAreaFilled(false);
			objectButton[i].setBorder(null);
			windowControl.add(objectButton[i]);
		}

		ButtonPlacement.placeControl();

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
