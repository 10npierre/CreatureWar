
/**
 * Write a description of class CyberDemon here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.awt.image.BufferedImage;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.*;
import java.io.File;
import javax.imageio.ImageIO;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class CyberDemon extends Demon
{
    public CyberDemon()
    {
       super();
    }

    public CyberDemon(int str, int hp) {
        super(str, hp);
    }

    public void takeDamage(int damage) {
        super.takeDamage(damage);
        System.out.println("          Cyber Demon took " + damage + " damage!");
    }

     public ImageIcon getImage() {
	    ImageIcon image;
	    if (super.isRight()) {
	  	    image = new ImageIcon("rsz_cyberdemon.jpg");
	    	return image;
	    }
	    else {
	  		image = new ImageIcon("cyberdemon.jpg");
	    }
	    return image;
    }
}
