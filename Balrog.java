
/**
 * Write a description of class Balrog here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Random;
import java.awt.Image;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.ImageIcon;

public class Balrog extends Demon
{
    private Image balrog;
    
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
    
    public void paint(Graphics2D g, int x, int y) {
        ImageIcon ii = new ImageIcon("balrog.jpg");
        balrog = ii.getImage();
        g.drawImage(balrog, x, y, null);
    }
}
