package pack1;

import java.awt.*;
import javax.swing.*;

public class Zeichnen extends JLabel {

	private static final long serialVersionUID = 1L;

	protected void paintComponent(Graphics g) {
		
		super.paintComponent(g);

		Graphics2D g2d = (Graphics2D) g;

		g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
		//Grundriss - Form
		if(Var.stateZeichnen == 1){
			g.drawImage(ImageLoader.square, 50, 50, 125, 125, null);
			g.drawImage(ImageLoader.rechtsOben, 175, 50, 125, 125, null);
		} //Masse Square
		else if (Var.stateZeichnen == 2){
			
			g.drawImage(ImageLoader.squareFarbe, 225, 45 , 145, 145, null);
			
		}// Raum Square
		else if (Var.stateZeichnen == 3){
			
			g.drawImage(ImageLoader.square, 0,0 , Masse.breiteInput - 10, Masse.laengeInput - 35, null);
		}
		
		
		
	}

}
