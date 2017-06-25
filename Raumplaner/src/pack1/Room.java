package pack1;

import java.awt.event.*;

import javax.swing.JFrame;

public class Room {
	static JFrame room;
	static int x,y;

	public Room() {

		room = new JFrame("Raum");
		room.setResizable(false);
		room.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		room.setLocationRelativeTo(null);
		room.setLayout(null);

		room.addMouseListener(new MouseAdapter() {

			public void mousePressed(MouseEvent e) {
				x = e.getX();
				y = e.getY();
				
				Var.stateZeichnen = 6;
				
				
				System.out.println(x + "," + y);
				
				
			}

		});
	}

}
