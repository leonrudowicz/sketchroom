package pack1;

import java.awt.BasicStroke;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;

import javax.swing.JLabel;

public class ZeichnenRaum extends JLabel {

	
	static int squareW, squareH;
	private static final long serialVersionUID = 1L;

	protected void paintComponent(Graphics g) {

		super.paintComponent(g);

		Graphics2D g2d = (Graphics2D) g;

		g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

		((Graphics2D) g).setStroke(new BasicStroke(3));

		
		squareW = Create.breiteInput;
		squareH = Create.längeInput;
		
		g.drawImage(ImageLoader.square, 0,0 , squareW - 10, squareH - 35, null);
		
		
		
		
	}

}