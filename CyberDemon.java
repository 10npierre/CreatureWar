
/**
 * Write a description of class CyberDemon here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Random;
import java.awt.Image;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.ImageIcon;

public class CyberDemon extends Demon
{
    private Image cyberdemon;
    
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
    
    public void paint(Graphics2D g, int x, int y) {
        ImageIcon ii = new ImageIcon("cyberdemon.jpg");
        cyberdemon = ii.getImage();
        g.drawImage(cyberdemon, x, y, null);
    }
}
