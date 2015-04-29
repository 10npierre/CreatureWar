/**
 * Human is a basic creature
 *
 * @author Crosbie
 * @version April 20, 2015
 */

import java.awt.image.BufferedImage;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.ImageIcon;
import java.io.File;
import javax.imageio.ImageIO;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;

public class Human extends Creature
{
  private final double SPECIAL_CHANCE = .1;

  Human() {
      super();
  }

  Human(int str, int hp){
      super(hp, str);
  }

  /**
     * take damage removes d hit points from the health
     *
     * @param damage - value to subtract from health
     */
    public void takeDamage(int damage){
        double roll = rand.nextDouble();
        super.takeDamage(damage);
        System.out.println("          Human took " + damage + " damage!");
        if(!this.isAlive() && roll < SPECIAL_CHANCE) {
            super.takeDamage(-damage);
            System.out.println("          Human got a second wind! It gains " + damage + " health.");
        }
    }

  public ImageIcon getImage() {
	  ImageIcon image;
	  if (super.isRight()) {
        image = new ImageIcon("rsz_human.jpg");
        return image;
	  }
	  else {
		image = new ImageIcon("human.jpg");
	  }
	  return image;
  }
}

