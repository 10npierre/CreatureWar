
/**
 * Write a description of class Balrog here.
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

public class Balrog extends Demon
{
    private BufferedImage balrog;
    
    public Balrog(int str, int hp) {
        super(str, hp);
    }
    
    public int attack(){
       //ask creature for my attack damage
       int tempAttackDamage;
       tempAttackDamage = super.attack();
       tempAttackDamage += super.attack();
       
       return tempAttackDamage;  
    }
    
    public void takeDamage(int damage) {
        super.takeDamage(damage);
        System.out.println("          Balrog took " + damage + " damage!");
    }
}
