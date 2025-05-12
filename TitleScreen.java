import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class TitleScreen here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TitleScreen extends World
{

    Label titleLabel = new Label("Hungry Snake", 75);
    Label titleLabel2 = new Label("Click space to start", 30);
    Elephant elephant = new Elephant();
    /**
     * Constructor for objects of class TitleScreen.
     * 
     */
    public TitleScreen()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1);
        setBackground("images/title screen background.jpeg");
        addObject(titleLabel, 300, 200);
        addObject(titleLabel2, 300, 280);
        addObject(elephant, 300, 100);
    }

    public void act()
    {
        if (Greenfoot.isKeyDown("space"))
        {
            MyWorld gameWorld = new MyWorld();
            Greenfoot.setWorld(gameWorld);
        }
    }
}
