package pack1;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;

public class ActionHandler implements ActionListener {

	public ActionHandler() {
		
		

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == Var.button[0]) {
			
			Var.windowMasse.add(Var.rot);
			Var.windowMasse.add(Var.blue);
			
			Var.windowForm.setVisible(false);
			Var.windowMasse.setVisible(true);

		} else if (e.getSource() == Var.button[1]) {
			
			Var.windowMasse.add(Var.rot);
			Var.windowMasse.add(Var.blue);
			Var.windowMasse.add(Var.orange);
			Var.windowMasse.add(Var.magenta);
			
			Var.windowForm.setVisible(false);
			Var.windowMasse.setVisible(true);

		} else if (e.getSource() == Var.button[2]) {

		} else if (e.getSource() == Var.button[3]) {

		} else if (e.getSource() == Var.button[4]) {

		} else if (e.getSource() == Var.button[5]) {

		} else if (e.getSource() == Var.button[6]) {

		} else if (e.getSource() == Var.button[7]) {

		} else if (e.getSource() == Var.button[8]) {

		} else if (e.getSource() == Var.button[9]) {

		} else if (e.getSource() == Var.button[10]) {

		} else if (e.getSource() == Var.button[11]) {

		} else if (e.getSource() == Var.button[12]) {

		} else if (e.getSource() == Var.button[13]) {

		} else if (e.getSource() == Var.button[14]) {

		}

	}
}
