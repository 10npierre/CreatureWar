/**
 * Elf is a magic creature that has a 10% chance at doing double attack damage
 * 
 * @author Crosbie 
 * @version April 20, 2015
 */

import java.util.Random;
import java.awt.Image;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.ImageIcon;

public class Elf extends Creature 
{
  
  private final double CHANCE_TO_DODGE = .25;
  private Image elf;
  Elf() {
      super();
  }
  
  Elf(int str, int hp){
      super(hp, str);
  }
  
  public int attack(){
       //ask creature for my attack damage
       int tempAttackDamage;
       tempAttackDamage = super.attack();
       
       //roll the dice (use creature's rand)
       //if less than 10%, damage = damage * 2
       if (rand.nextInt(10) == 0) {
           tempAttackDamage *= 2;
           System.out.println("          SHAZAM!!!!");
           //tempAttackDamage = tempAttackDamage * 2;
           //tempAttackDamage = tempAttackDamage + tempAttackDamage;
       }
       
       return tempAttackDamage;  
    }
  
  /**
     * take damage removes d hit points from the health
     * 
     * @param damage - value to subtract from health
     */
    public void takeDamage(int damage){
        double roll = rand.nextDouble();        
        if(roll >= CHANCE_TO_DODGE) {
            super.takeDamage(damage);
            System.out.println("          Elf took " + damage + " damage!");
        }
        else {
            super.takeDamage(0);
            System.out.println("          Elf dodged the attack!");
        }
    }
    
  public void paint(Graphics2D g, int x, int y) {
        ImageIcon ii = new ImageIcon("elf.jpg");
        elf = ii.getImage();
        g.drawImage(elf, x, y, null);
  }
}