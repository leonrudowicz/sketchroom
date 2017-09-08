package pack1;

import java.awt.*;
import moebel.*;

import javax.swing.*;

public class Zeichnen extends JPanel {
	
	
	private static final long serialVersionUID = 1L;

	public void paint(Graphics g) {

		Graphics2D g2d = (Graphics2D) g;

		g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
		if (Var.stateZeichnen == 0) {
			g.setFont(new Font("Bauhaus 93", Font.PLAIN, 35));
			g.drawImage(ImageLoader.blueprint, 0, 0, 500, 300, null);
			g.drawString("Wilkommen bei SketchRoom", 30, 60);
		}
		// Grundriss - Form
		else if (Var.stateZeichnen == 1) {

			g.drawImage(ImageLoader.square, 50, 50, 125, 125, null);
			g.drawImage(ImageLoader.rechtsOben, 175, 50, 125, 125, null);

		} // Masse Square
		else if (Var.stateZeichnen == 2) {
			g.drawImage(ImageLoader.squareFarbe, 225, 45, 145, 145, null);

		}

		if(Var.stateZeichnen > 2){
			
			
			

			if(Var.stateObject == 1){
				g.drawImage(ImageLoader.teppich, Room.x, Room.y, ObjectMasse.laengeInt, ObjectMasse.breiteInt, null);
				g.drawImage(ImageLoader.teppich, Room.x, Room.y, ObjectMasse.laengeInt, ObjectMasse.breiteInt, null);
				
				Room.room.repaint();
			}
			if(Var.stateObject == 2){
				g.drawImage(ImageLoader.stuhl, 100, 100, ObjectMasse.laengeInt, ObjectMasse.breiteInt, null); 
				Room.room.repaint();
			}
			if(Chair.draw()){
				g.drawImage(ImageLoader.stuhl, Chair.posX, Chair.posY, Chair.laenge, Chair.breite, null);
				Room.room.repaint();
			}
		
			
			
			
			g.drawImage(ImageLoader.teppich, 820, 10, 100, 100, null);
			g.drawImage(ImageLoader.stuhl, 930, 10, 100, 100, null);
			g.drawImage(ImageLoader.tisch, 820, 120, 100, 100, null);
			g.drawImage(ImageLoader.tisch, 930, 120, 100, 100, null);
			g.drawImage(ImageLoader.stuhl, 820, 230, 100, 100, null);
			g.drawImage(ImageLoader.stuhl, 930, 230, 100, 100, null);
			g.drawImage(ImageLoader.stuhl, 820, 340, 100, 100, null);
			g.drawImage(ImageLoader.stuhl, 930, 340, 100, 100, null);
			
			
			// Raum Square
			if (Var.stateZeichnen == 3) {
				((Graphics2D) g).setStroke(new BasicStroke(10));
	
				// Horizontal
				g.drawLine(0, 0, 800, 0);
				g.drawLine(0, 800, 800, 800);
	
				// Vertikal
				g.drawLine(0, 0, 0, 800);
				g.drawLine(800, 0, 800, 800);

				
			}
	
			 // RechtsOben Raum
			else if (Var.stateZeichnen == 5) {
				((Graphics2D) g).setStroke(new BasicStroke(10));
				// Horizontal
				g.drawLine(0, 0, Masse.breiteInput - Masse.breite2Input, 0);// //oben
	
				g.drawLine(Masse.breiteInput - Masse.breite2Input, Masse.laengeInput - Masse.laenge2Input,
						Masse.breiteInput, Masse.laengeInput - Masse.laenge2Input);// Mitte
				g.drawLine(0, Masse.laengeInput, Masse.breiteInput, Masse.laengeInput); // Unten
	
				// Vertikal
				g.drawLine(0, 0, 0, Masse.laengeInput); // links
				g.drawLine(Masse.breiteInput - Masse.breite2Input, 0, Masse.breiteInput - Masse.breite2Input,
						Masse.laengeInput - Masse.breite2Input);// Mitte
				g.drawLine(Masse.breiteInput, Masse.laengeInput - Masse.laenge2Input, Masse.breiteInput, Masse.laengeInput); // rechts
	
			}
		
			Room.room.repaint();
		}
		
		// Masse RechtsOben Farbe
		else if (Var.stateZeichnen == 4) {
			g.drawImage(ImageLoader.rechtsObenFarbe, 375, 45, 145, 145, null);
		}
	}

}
