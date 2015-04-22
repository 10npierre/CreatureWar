/**
 * Human is a basic creature
 * 
 * @author Crosbie 
 * @version April 20, 2015
 */

import java.awt.Image;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.ImageIcon;

public class Human extends Creature 
{
  private final double SPECIAL_CHANCE = .1;
  private Image human;
  
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
    
  public void paint(Graphics2D g, int x, int y) {
        ImageIcon ii = new ImageIcon("human.jpg");
        human = ii.getImage();
        g.drawImage(human, x, y, null);
  }
}

