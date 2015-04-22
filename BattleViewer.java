
/**
 * Write a description of class BattleViewer here.
 * 
 * @author Ryan Bowen
 * @version 0.0.1
 */
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import javax.swing.*;

public class BattleViewer extends JPanel
{
    private Battle battle;

    /**
     * Constructor for objects of class BattleViewer
     */
    public BattleViewer(Battle battle)
    {
       this.battle = battle;
       JFrame frame = new JFrame("War");
       frame.add(this);
       frame.setSize(800, 600);
       frame.setVisible(true);
       frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public void paint(Graphics g)
    {
        super.paint(g);
        Graphics2D g2d = (Graphics2D) g;
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
                RenderingHints.VALUE_ANTIALIAS_ON);
        if (battle.getOneCurrent() != null) {
            battle.getOneCurrent().paint(g2d, 250, (getHeight()/2) - 100);
            g2d.drawString(battle.getOneCurrent().getHealthText(), 250, (getHeight()/2) - 125);  
        }
        if (battle.getTwoCurrent() != null) {
            battle.getTwoCurrent().paint(g2d, 450, (getHeight()/2) - 100);
            g2d.drawString(battle.getTwoCurrent().getHealthText(), 450, (getHeight()/2) - 125);   
        }
        g2d.drawString("Creatures remaining: " + battle.getOneRemainingText(), 150, (getHeight()/4) - 50);
        g2d.drawString("Creatures remaining: " + battle.getTwoRemainingText(), 550, (getHeight()/4) - 50);
    }
}
