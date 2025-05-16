import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class TitleScreen here.
 * 
 * @author Jennifer and Nereyal
 * @version May 2025
 */
public class TitleScreen extends World
{

    Label titleLabel = new Label("Hungry Elephant", 75);
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
        setBackground("images/title screen background.jpg");
        addObject(titleLabel, 300, 200);
        addObject(titleLabel2, 300, 280);
        addObject(elephant, 300, 100);
        prepare();
    }

    public void act()
    {
        if (Greenfoot.isKeyDown("space"))
        {
            MyWorld gameWorld = new MyWorld();
            Greenfoot.setWorld(gameWorld);
        }
    }
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Label label = new Label("Use <-- and --> keys to move", 25);
        addObject(label,287,341);
        label.setLocation(300,310);
        Label label2 = new Label("Collect apples. Bananas give x2 points. Bombs kill.", 25);
        addObject(label2,280,357);
        label2.setLocation(300,340);
    }
}
