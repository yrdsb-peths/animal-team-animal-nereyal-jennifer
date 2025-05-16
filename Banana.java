import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Banana falls and gives 2 points when elephant touches
 * 
 * @author Jennifer
 * @version May 2025
 */
public class Banana extends Actor
{
    /**
     * Act - do whatever the Banana wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
     int speed = 1;
    /**
     * Act - do whatever the Insect wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Banana(){
        setImage("images/bananas.png");
    }
    public void act()
    {
        // Add your action code here.
        setLocation(getX(), getY() + 1);
        MyWorld world= (MyWorld) getWorld();
        if(getY() == world.getHeight())
        {
            world.spawnBanana();
        }
        
    }
    
    public void setSpeed(int spd)
    {
        speed = spd;
    }
}
