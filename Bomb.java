import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * A bomb object that falls, when elephant touches game is over
 * 
 * @author Nereyal
 * @version May 2025
 */
public class Bomb extends Actor
{
    /**
     * Act - do whatever the Bomb wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int speed = 1;
    /**
     * Act - do whatever the Bomb wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Bomb(){
        setImage("images/bomb.png");
    }
    public void act()
    {
        // Add your action code here.
        setLocation(getX(), getY() + 1);
        MyWorld world= (MyWorld) getWorld();
        bombExplodes();
        
    }
    
    public void bombExplodes()
    {
        setLocation(getX(), getY() + 1);
        MyWorld world= (MyWorld) getWorld();
        if(isTouching(Elephant.class))
        {
            world.gameOver();
            world.removeObject(this);
        }
        if(getY() == world.getHeight())
        {
            world.spawnBomb();
        }
    }
    
    public void setSpeed(int spd)
    {
        speed = spd;
    }
}
