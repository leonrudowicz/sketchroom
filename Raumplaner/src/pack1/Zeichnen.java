package pack1;

import java.awt.*;
import javax.swing.*;

public class Zeichnen extends JLabel {

	private static final long serialVersionUID = 1L;

	protected void paintComponent(Graphics g) {
		
		

		super.paintComponent(g);

		Graphics2D g2d = (Graphics2D) g;

		g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
		// Grundriss - Form
		if (Var.stateZeichnen == 1) {
			g.drawImage(ImageLoader.square, 50, 50, 125, 125, null);
			g.drawImage(ImageLoader.rechtsOben, 175, 50, 125, 125, null);
		} // Masse Square
		else if (Var.stateZeichnen == 2) {

			g.drawImage(ImageLoader.squareFarbe, 225, 45, 145, 145, null);

		} // Raum Square
		else if (Var.stateZeichnen == 3) {

			g.drawImage(ImageLoader.square, 0, 0, Masse.breiteInput - 10, Masse.laengeInput - 35, null);
		} // Masse RechtsOben Farbe
		else if (Var.stateZeichnen == 4) {
			g.drawImage(ImageLoader.rechtsObenFarbe, 375, 45, 145, 145, null);
		} //RechtsOben Raum
		else if (Var.stateZeichnen == 5) {
			((Graphics2D) g).setStroke(new BasicStroke(4));
			
			//Horizontal
			g.drawLine(0, 0,  Masse.breiteInput - Masse.breite2Input, 0); //oben
			g.drawLine(Masse.breiteInput - Masse.breite2Input, Masse.laengeInput - Masse.laenge2Input, Masse.breiteInput, Masse.laengeInput - Masse.laenge2Input);// Mitte
			g.drawLine(0, 0, Masse.breiteInput, 0); //Unten
			
			//Vertikal
			g.drawLine(0, 0,  0, Masse.laengeInput); //links
			g.drawLine(Masse.breiteInput - Masse.breite2Input, 0, Masse.breiteInput - Masse.breite2Input, Masse.laengeInput - Masse.breite2Input);// Mitte
			g.drawLine(0, 0, Masse.breiteInput, 0); //rechts
			
		}

	}

}
