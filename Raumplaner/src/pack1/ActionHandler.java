package pack1;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;

public class ActionHandler implements ActionListener {

	public ActionHandler() {
		JFrame raumSquare;

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == Var.button[0]) {
			
			Var.windowForm.setVisible(false);
			Var.windowMaﬂe.setVisible(true);
		
		}

	}
}
