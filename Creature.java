import java.util.Random;
import java.awt.Graphics2D;
import javax.swing.*;
import java.awt.image.BufferedImage;
/**
 * Abstract class Creature - write a description of the class here
 *
 * Creature implements all of its methods but is abstract
 * in order to maintain the context of all combatants being creatures
 * but the 'basic' creature of Human exists to give a contextual name
 *
 * @author Crosbie
 * @version April 20, 2015
 */
public abstract class Creature
{
   protected static Random rand = new Random();

   private int health;  // when health drops to 0 or below, creature is dead
   private int strength; // used to calculate maximum damage
   private boolean isRight = false;

   /**
    * default constructor with base stats of 12 health and strength
    */
   Creature(){
       health = 12;
       strength = 12;
       // or call the other constructor
       // this(12,12);
   }

   /**
    * Creature receives h and s to indicate max health and strength
    *
    * @param h intial hit points
    * @param s strength - used to determine damage
    */
   Creature(int h, int s) {
       health = h;
       strength = s;
    }

   /**
    * attack causes up to 1-strength point(s) of damage
    *
    * @return damage caused by attack
    */
   public int attack(){
       return rand.nextInt(strength) + 1;
    }

    /**
     * take damage removes d hit points from the health
     *
     * @param damage - value to subtract from health
     */
    public void takeDamage(int damage){
        health = health - damage;
        // health -= damage;

    }

    /**
     * @ return true if health > 0, else false
     */
    public boolean isAlive() {

        return health > 0;

    }

    public String getHealthText() {
        if(health > 0) {
            return health + " health remaining.";
        }
        else {
            return "Creature is dead!";
        }
    }

    public void setRight(boolean state) {
		isRight = state;
	}

	public boolean isRight() {
		return isRight;
	}

    public abstract ImageIcon getImage();


}
