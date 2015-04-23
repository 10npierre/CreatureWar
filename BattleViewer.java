
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

public class BattleViewer extends JFrame
{
    private Battle battle;
    private JPanel contentPane;
    BufferedImage onePic;
    BufferedImage twoPic;
    JLabel labelLRemaining;
    JLabel labelRRemaining;

    /**
     * Constructor for objects of class BattleViewer
     */
    public BattleViewer(Battle battle)
    {
       this.battle = battle;
       createWindow();
    }
    
    
    public void createWindow() {
       	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 400);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(8, 3, 0, 0));
		
		JLabel label = new JLabel("");
		contentPane.add(label);
		
		JLabel lblCreatureWar = new JLabel("Creature War");
		lblCreatureWar.setHorizontalAlignment(SwingConstants.CENTER);
		lblCreatureWar.setFont(new Font("Myriad Pro", Font.PLAIN, 22));
		contentPane.add(lblCreatureWar);
		
		JLabel label_5 = new JLabel("");
		contentPane.add(label_5);
		
		JLabel lblSideOne = new JLabel("Side One");
		lblSideOne.setHorizontalAlignment(SwingConstants.CENTER);
		lblSideOne.setFont(new Font("Myriad Pro", Font.PLAIN, 14));
		contentPane.add(lblSideOne);
		
		JLabel label_6 = new JLabel("");
		contentPane.add(label_6);
		
		JLabel lblSideTwo = new JLabel("Side Two");
		lblSideTwo.setHorizontalAlignment(SwingConstants.CENTER);
		lblSideTwo.setFont(new Font("Myriad Pro", Font.PLAIN, 14));
		contentPane.add(lblSideTwo);
		
		labelLRemaining = new JLabel("Creatures Remaining: " + battle.getOneRemainingText());
		labelLRemaining.setHorizontalAlignment(SwingConstants.CENTER);
		labelLRemaining.setFont(new Font("Myriad Pro", Font.PLAIN, 14));
		contentPane.add(labelLRemaining);
		
		JLabel label_4 = new JLabel("");
		contentPane.add(label_4);
		
		labelRRemaining = new JLabel("Creatures Remaining:" + battle.getTwoRemainingText());
		labelRRemaining.setHorizontalAlignment(SwingConstants.CENTER);
		labelRRemaining.setFont(new Font("Myriad Pro", Font.PLAIN, 14));
		contentPane.add(labelRRemaining);
		
		JLabel onePic = new JLabel("");
		onePic.setIcon(new ImageIcon("\\human.jpg"));
		contentPane.add(onePic);
		
		JLabel label_2 = new JLabel("");
		contentPane.add(label_2);
		
		JLabel label_1 = new JLabel("");
		contentPane.add(label_1);
		
		JLabel label_3 = new JLabel("");
		contentPane.add(label_3);
		
		JLabel twoRemain = new JLabel("");
		contentPane.add(twoRemain);
		
		JLabel twoPic = new JLabel("");
		contentPane.add(twoPic);
		
		JLabel label_7 = new JLabel("");
		contentPane.add(label_7);
		
		JLabel oneRemain = new JLabel();
		contentPane.add(oneRemain);
		setVisible(true);
    }
    
    public void refresh() {
        labelLRemaining.setText("Creatures Remaining: " + battle.getOneRemainingText());
        labelRRemaining.setText("Creatures Remaining: " + battle.getTwoRemainingText());
        revalidate();
        repaint();
    }
      
}
    

