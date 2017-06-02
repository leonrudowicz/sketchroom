package pack1;

import java.awt.BasicStroke;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;

import javax.swing.JLabel;

public class Zeichnen extends JLabel {

	static int borderB = Funktion.raumB / 15;
	static int borderL = Funktion.raumL / 15;

	private static final long serialVersionUID = 1L;

	protected void paintComponent(Graphics g) {

		super.paintComponent(g);

		Graphics2D g2d = (Graphics2D) g;

		g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

		((Graphics2D) g).setStroke(new BasicStroke(3));

		// Grundriss
		// Horizontal
		g.drawLine(0, 0, Funktion.raumB - 10, 0); // oben
		g.drawLine(0, Funktion.raumL - 35, Funktion.raumB - 10, Funktion.raumL - 35); // unten
		// Vertikal
		g.drawLine(0, 0, 0, Funktion.raumB - 35); // links
		g.drawLine(Funktion.raumL - 10, 0, Funktion.raumL - 10, Funktion.raumB - 35); // rechts

	}

}