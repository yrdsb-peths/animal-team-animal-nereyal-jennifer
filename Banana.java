import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Banana here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
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
        if(getY() >= world.getHeight())
        {
            world.gameOver();
            world.removeObject(this);
        }
        
    }
    
    public void setSpeed(int spd)
    {
        speed = spd;
    }
}
