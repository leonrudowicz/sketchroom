package pack1;

import java.awt.Color;
import java.awt.event.*;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Room {
	static JFrame room;
	static JButton save;
	static JButton objectButton[] = new JButton[16];
	static int x,y;
	

	public Room() {

		room = new JFrame("Raum - " + Masse.breiteInput + "," + Masse.laengeInput);
		room.setResizable(false);
		room.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//room.setLocationRelativeTo(null);
		room.setLayout(null);
		
		save = new JButton("Save");
		save.setBounds(875, 725, 100, 40);
		save.setVisible(true);
		save.setBackground(new Color(48, 120, 154));
		save.setForeground(Color.WHITE);
		save.setFocusPainted(false);
		//save.
		save.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				System.out.println("Save Button funktioniert");
			}

		});
		room.add(save);
		
		for (int i = 0; i < objectButton.length; i++) {
			objectButton[i] = new JButton();
			objectButton[i].setVisible(true);
			objectButton[i].addActionListener(new ActionHandler());
			objectButton[i].setFocusPainted(false);
			objectButton[i].setContentAreaFilled(false);
			objectButton[i].setBorder(null);
			room.add(objectButton[i]);
		}
		
		ButtonPlacement.placeControl();
		
		
		 room.addMouseListener(new MouseAdapter() {
			   
			 public void mouseClicked(MouseEvent e){
			    
					x = e.getX();
					y = e.getY();
						
					System.out.println(x + "," + y);
				    
			   }
			   
			  }); 
			
			
	}
}
