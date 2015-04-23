
/**
 * Write a description of class BattleViewer here.
 * 
 * @author Ryan Bowen
 * @version 0.0.1
 */
import java.awt.*;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.BorderLayout;
import java.awt.image.*;
import java.io.File;
import javax.imageio.ImageIO;
import java.io.IOException;

public class BattleViewer extends JPanel
{
    private Battle battle;
    private JPanel contentPane;
    BufferedImage onePic;
    BufferedImage twoPic;

    /**
     * Constructor for objects of class BattleViewer
     */
    public BattleViewer(Battle battle)
    {
       this.battle = battle;
       createWindow();
    }
    
    private void createWindow() {
        JFrame window = new JFrame("Creature War");
        window.setSize(600, 400);		    
        
        contentPane = new JPanel();
        setBounds(100, 100, 600, 400);
    	contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
    	contentPane.setLayout(null);
    	    	    	
    	JLabel lblCreatureWar = new JLabel("Creature War");
    	lblCreatureWar.setBounds(5, 5, 574, 23);
    	lblCreatureWar.setHorizontalAlignment(SwingConstants.CENTER);
    	lblCreatureWar.setFont(new Font("Myriad Pro", Font.PLAIN, 22));
    	contentPane.add(lblCreatureWar);
    	
    	JLabel lblSideOne = new JLabel("Side One");
    	lblSideOne.setFont(new Font("Myriad Pro", Font.PLAIN, 14));
    	lblSideOne.setBounds(70, 39, 58, 14);
    	contentPane.add(lblSideOne);
    	
    	JLabel lblSideTwo = new JLabel("Side Two");
    	lblSideTwo.setFont(new Font("Myriad Pro", Font.PLAIN, 14));
    	lblSideTwo.setBounds(467, 39, 58, 14);
    	contentPane.add(lblSideTwo);
    	
    	JLabel labelLRemaining = new JLabel("Creatures Remaining: ");
    	labelLRemaining.setFont(new Font("Myriad Pro", Font.PLAIN, 14));
    	labelLRemaining.setBounds(55, 64, 158, 14);
    	contentPane.add(labelLRemaining);
    	
    	JLabel labelRRemaining = new JLabel("Creatures Remaining: ");
    	labelRRemaining.setFont(new Font("Myriad Pro", Font.PLAIN, 14));
    	labelRRemaining.setBounds(410, 64, 145, 14);
    	contentPane.add(labelRRemaining);
    	    	    	
    	window.setVisible(true);
    	window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	
    	window.getContentPane().add(contentPane);

    }
    
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        
        JLabel labelLRemainingNumber = new JLabel(battle.getOneRemainingText());
    	labelLRemainingNumber.setFont(new Font("Myriad Pro", Font.PLAIN, 14));
    	labelLRemainingNumber.setBounds(255, 64, 50, 14);
    	contentPane.add(labelLRemainingNumber);
    }
}
    

