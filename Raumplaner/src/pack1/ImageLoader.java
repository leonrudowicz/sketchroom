package pack1;

import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class ImageLoader {
	static Image teppich, square, rechtsOben, squareFarbe, rechtsObenFarbe;
	
	public ImageLoader(){
			try {
				teppich = ImageIO.read(new File("res/teppich.jpg"));
				square = ImageIO.read(new File("res/QuadratGrundriss.png"));
				rechtsOben = ImageIO.read(new File("res/RechtsObenGrundriss.png"));
				squareFarbe = ImageIO.read(new File("res/QuadratGrundrissFarbe.png"));
				rechtsObenFarbe = ImageIO.read(new File("res/RechtsObenGrundrissFarbe.png"));
				
			} catch (IOException e) {
				e.printStackTrace();
			}
		
		
	}
}
