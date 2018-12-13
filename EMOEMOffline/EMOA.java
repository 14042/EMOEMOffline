import greenfoot.*;

/**
 * Write a description of class EMOA here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class EMOA extends Actor
{
    /**
     * Act - do whatever the EMOA wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if( Greenfoot.isKeyDown( "up" ) ){
        setRotation(270);
        move(10);
}// Add your action code here.
    }    
}
