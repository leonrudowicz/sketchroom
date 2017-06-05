package pack1;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ActionHandler implements ActionListener {

	public ActionHandler() {

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == Funktion.button[0]) {
			Funktion.windowLoad.setVisible(false);
			Create.windowStart.setVisible(true);

		}

	}
}
