import greenfoot.*;

/**
 * Write a description of class F1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class F1 extends World
{

    /**
     * Constructor for objects of class F1.
     * 
     */
    public F1()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        addObject( new EMOA(), 587, 100 );
    }
    public void act()
    {
        /*if(Greenfoot.isKeyDown("space"))
        {
            World MyWorld = new MyWorld();
            Greenfoot.setWorld(MyWorld);
        }*/
    }
}
