package pack1;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import moebel.*;

public class ActionHandler implements ActionListener {
	
	int c = 0;

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == Grundriss.button[0]) {
			Var.stateZeichnen = 2;
			new Masse();
			
			Masse.windowMasse.add(Masse.rot);
			Masse.windowMasse.add(Masse.blue);
			
			Masse.neuSquare.setVisible(true);
			Grundriss.windowForm.setVisible(false);
			Masse.windowMasse.setVisible(true);

		} else if (e.getSource() == Grundriss.button[1]) {
			Var.stateZeichnen = 4;
			new Masse();
			Masse.windowMasse.add(Masse.rot);
			Masse.windowMasse.add(Masse.blue);
			Masse.windowMasse.add(Masse.orange);
			Masse.windowMasse.add(Masse.magenta);
			
			//Masse.neuSquare.setVisible(false);
			Masse.neuRechtsOben.setVisible(true);
			
			Grundriss.windowForm.setVisible(false);
			Masse.windowMasse.setVisible(true);

		} else if (e.getSource() == Grundriss.button[2]) {

		} else if (e.getSource() == Grundriss.button[3]) {

		} else if (e.getSource() == Grundriss.button[4]) {

		} else if (e.getSource() == Grundriss.button[5]) {

		} else if (e.getSource() == Grundriss.button[6]) {

		} else if (e.getSource() == Grundriss.button[7]) {

		} else if (e.getSource() == Grundriss.button[8]) {

		} else if (e.getSource() == Grundriss.button[9]) {

		} else if (e.getSource() == Grundriss.button[10]) {

		} else if (e.getSource() == Grundriss.button[11]) {

		} else if (e.getSource() == Grundriss.button[12]) {

		} else if (e.getSource() == Grundriss.button[13]) {

		} else if (e.getSource() == Grundriss.button[14]) {

		}
		
		if (e.getSource() == Room.objectButton[0]) {
			objectMasse();
			Var.stateObject = 1;
			

		}
		else if (e.getSource() == Room.objectButton[1]) {
			//c++;
			objectMasse();
			new Chair(ObjectMasse.laengeInt, ObjectMasse.breiteInt, Room.x, Room.y);
			//Var.stateObject = 2;
			

		}
		else if (e.getSource() == Room.objectButton[2]) {
			System.out.println("Test");
		}
		else if (e.getSource() == Room.objectButton[3]) {
			System.out.println("Test");
		}
		else if (e.getSource() == Room.objectButton[4]) {
			System.out.println("Test");
		}
		else if (e.getSource() == Room.objectButton[5]) {
			System.out.println("Test");
		}
		else if (e.getSource() == Room.objectButton[6]) {
			System.out.println("Test");
		}
		else if (e.getSource() == Room.objectButton[7]) {
			System.out.println("Test");
		}
		
		
	}
	public static void objectMasse(){
		ObjectMasse.windowObject.setVisible(true);
	}
	
}
