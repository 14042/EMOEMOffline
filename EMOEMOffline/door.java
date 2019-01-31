import greenfoot.*;

/**
 * Write a description of class door here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class door extends Actor
{

    /**
     * Act - do whatever the door wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        getImage().setTransparency(0);
                   
        Actor actor = getOneObjectAtOffset( 0, 0, EMOA.class );
        if( actor != null ){
           
            getWorld().showText( "外に出ますか?\n\n Yes:Space", 340, 240 );
            if( Greenfoot.isKeyDown( "space" ) ){
                getWorld().showText( "本当に?\n\n Yes:Enter", 340, 240 );
                if( Greenfoot.isKeyDown( "enter" ) ){
                    Greenfoot.stop();
                }   
            }
        }
        else if( actor == null )
        {
            getWorld().showText( "", 340, 240 ); 
        }

    }    
}
