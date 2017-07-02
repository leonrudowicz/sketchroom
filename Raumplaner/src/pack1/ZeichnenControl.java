package pack1;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;

import javax.swing.JLabel;

public class ZeichnenControl extends JLabel {

	private static final long serialVersionUID = 1L;

	protected void paintComponent(Graphics g2) {

		super.paintComponent(g2);

		Graphics2D g2d = (Graphics2D) g2;

		g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

		g2.drawImage(ImageLoader.teppich, 20, 20, 100, 100, null);

	}
}
