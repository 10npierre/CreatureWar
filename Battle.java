
/**
 * Write a description of class Battle here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Random;
import java.util.ArrayList;
import javax.swing.*;

public class Battle
{
    private BattleViewer battleViewer;
    private ArrayList<Creature> sideOne;
    private ArrayList<Creature> sideTwo;
    private Random rand = new Random();
    private CreatureGenerator creatureGen = new CreatureGenerator(this);
    private Creature oneCurrent;
    private Creature twoCurrent;
    /**
     * Create a new battle
     */
    public Battle()
    {
        battleViewer = new BattleViewer(this);     
        sideOne = new ArrayList<Creature>();
        sideTwo = new ArrayList<Creature>();
        for(int i = 0; i < 25; i++) {
            sideOne.add(creatureGen.generateCreature());
            sideTwo.add(creatureGen.generateCreature());
        }
    }
    
    public Creature getOneCurrent() {
        return oneCurrent;
    }
    
     public Creature getTwoCurrent() {
        return twoCurrent;
    }
    
     public String getOneRemainingText() {
        return Integer.toString(sideOne.size());
    }
    
     public String getTwoRemainingText() {
        return Integer.toString(sideTwo.size());
    }
    
    /**
     * Run one full turn
     */
    public void runOne()
    {
        battleViewer.repaint();
        System.out.println("-------------------------------------");
        if(sideOne.size() == 0) {
            System.out.println("Side two wins!");
        }
        else if (sideTwo.size() == 0) {
            System.out.println("Side one wins!");
        }
        else {
            oneCurrent = sideOne.get(0);
            twoCurrent = sideTwo.get(0);
            
            System.out.println("Side One " + "(" + sideOne.size() + " creatures remaining):" );
            System.out.println(oneCurrent.getClass().getSimpleName() + " attacks the enemy "
                                + twoCurrent.getClass().getSimpleName() + ".");
            twoCurrent.takeDamage(oneCurrent.attack());
            System.out.println("          " + twoCurrent.getHealthText());
            battleViewer.repaint();
            System.out.println("Side Two " + "(" + sideTwo.size() + " creatures remaining):");
            if(!twoCurrent.isAlive() && sideTwo.size() > 1) {
                sideTwo.remove(twoCurrent);
                twoCurrent = sideTwo.get(0);
            }
            System.out.println(twoCurrent.getClass().getSimpleName() + " attacks the enemy " 
                                + oneCurrent.getClass().getSimpleName() + ".");
            oneCurrent.takeDamage(twoCurrent.attack());
            System.out.println("          " + oneCurrent.getHealthText());
            battleViewer.repaint();
            if(!oneCurrent.isAlive()) {
                sideOne.remove(oneCurrent);
            }
            if(!twoCurrent.isAlive()) {
                sideTwo.remove(twoCurrent);
            }
        }
       
    }
    
        /**
     * Run one full turn
     */
    public void runOneWithSleep() throws InterruptedException
    {
        System.out.println("--------------------------------");
        if(sideOne.size() == 0) {
            System.out.println("Side two wins!");
        }
        else if (sideTwo.size() == 0) {
            System.out.println("Side one wins!");
        }
        else {
            oneCurrent = sideOne.get(0);
            twoCurrent = sideTwo.get(0);
            
            System.out.println("Side One: ");
            System.out.println(oneCurrent.getClass().getSimpleName() + " attacks the enemy "
                                + twoCurrent.getClass().getSimpleName() + ".");
            twoCurrent.takeDamage(oneCurrent.attack());
            System.out.println("          " + twoCurrent.getHealthText());
            battleViewer.repaint();
            Thread.sleep(1000);
            System.out.println("Side Two: ");
            if(!twoCurrent.isAlive() && sideTwo.size() > 1) {
                sideTwo.remove(twoCurrent);
                twoCurrent = sideTwo.get(0);
            }
            System.out.println(twoCurrent.getClass().getSimpleName() + " attacks the enemy " 
                                + oneCurrent.getClass().getSimpleName() + ".");
            oneCurrent.takeDamage(twoCurrent.attack());
            System.out.println("          " + oneCurrent.getHealthText());
            battleViewer.repaint();
            Thread.sleep(1000);
            if(!oneCurrent.isAlive()) {
                sideOne.remove(oneCurrent);
            }
            if(!twoCurrent.isAlive()) {
                sideTwo.remove(twoCurrent);
            }
        }
       
    }
    
    public void runToCompletionWithSleep() throws InterruptedException {
        while(sideOne.size() != 0 && sideTwo.size() != 0) {
            runOneWithSleep();
        }
        if(sideOne.size() == 0) {
            System.out.println("--------------------------------");
            System.out.println("");
            System.out.println("Side two wins!");
            System.out.println("");  
            System.out.println("--------------------------------");
        }
        else if (sideTwo.size() == 0) {
            System.out.println("--------------------------------");
            System.out.println("");
            System.out.println("Side one wins!");
            System.out.println("");  
            System.out.println("--------------------------------");
        }
    }
    
    public void runToCompletion() {
        while(sideOne.size() != 0 && sideTwo.size() != 0) {
            runOne();
        }
        if(sideOne.size() == 0) {
            System.out.println("--------------------------------");
            System.out.println("");
            System.out.println("Side two wins!");
            System.out.println("");  
            System.out.println("--------------------------------");
        }
        else if (sideTwo.size() == 0) {
            System.out.println("--------------------------------");
            System.out.println("");
            System.out.println("Side one wins!");
            System.out.println("");  
            System.out.println("--------------------------------");
        }
    }
    
    public void reset() {
        sideOne.clear();
        sideTwo.clear();
        for(int i = 0; i < 25; i++) {
            sideOne.add(creatureGen.generateCreature());
            sideTwo.add(creatureGen.generateCreature());
        }
    }
}
