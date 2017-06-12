package pack1;

import javax.swing.JFrame;

public class Room {
	static JFrame room;
	
	public Room(){
		room = new JFrame();
		room.setSize(Masse.breiteInput, Masse.laengeInput);
		room.setResizable(false);
		room.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		room.setLocationRelativeTo(null);
		room.setLayout(null);
	}
}
