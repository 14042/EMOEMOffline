import greenfoot.*;

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        super(634, 400, 1);
        addObject( new door(), 75, 300 );
        addObject( new EMOA(), 587, 100 );
        addObject( new cat(), 140, 180 );

    }
    public void act()
    {
            //0 + (int)(Math.random()*((5-0)+1
    }
}
