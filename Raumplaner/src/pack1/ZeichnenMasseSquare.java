package pack1;

import java.awt.BasicStroke;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;

import javax.swing.JLabel;

public class ZeichnenMasseSquare extends JLabel {

	
	static int squareW, squareH;
	private static final long serialVersionUID = 1L;

	protected void paintComponent(Graphics g) {

		super.paintComponent(g);

		Graphics2D g2d = (Graphics2D) g;

		g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

		((Graphics2D) g).setStroke(new BasicStroke(3));

		
		g.drawImage(ImageLoader.squareFarbe, 225, 45 , 145, 145, null);
		
		
		
		
	}

}