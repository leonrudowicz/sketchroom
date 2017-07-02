package pack1;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;

public class ActionHandler implements ActionListener {

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
		
		if(e.getSource() == Control.objectButton[0]){
			System.out.println("Button wurde gedrückt");
			Var.stateObject = 0;
		}
	}
}
