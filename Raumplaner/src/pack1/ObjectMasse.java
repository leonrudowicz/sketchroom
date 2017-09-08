package pack1;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class ObjectMasse {
	
	static JFrame windowObject;
	static JTextField laenge, breite;
	JButton finish;
	static String inputL, inputB;
	static int breiteInt, laengeInt;
	

	public ObjectMasse() {
		windowObject = new JFrame("Wilkommen");
		windowObject.setSize(500, 300);
		windowObject.setResizable(false);
		windowObject.setLocationRelativeTo(null);
		windowObject.setLayout(null);
		
		laenge = new JTextField("Laenge");
		laenge.setBounds(50, 100, 145, 40);
		
		breite = new JTextField("Breite");
		breite.setBounds(250, 100, 145, 40);
		
		finish = new JButton("Finish");
		finish.setBounds(190, 220, 100, 40);
		finish.setBackground(new Color(31, 67, 135));
		finish.setForeground(Color.WHITE);
		finish.setFocusPainted(false);
		finish.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				inputL = laenge.getText();
				laengeInt = Integer.parseInt(inputL);
				
				inputB = breite.getText();
				breiteInt = Integer.parseInt(inputB);
				
				ObjectMasse.windowObject.setVisible(false);
			}

		});
		finish.setVisible(true);
		
		windowObject.add(laenge);
		windowObject.add(breite);
		windowObject.add(finish);
	}
	
	

}
