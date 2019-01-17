import greenfoot.*;

/**
 * Write a description of class EMOA here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

public class EMOA extends Actor
{
    private int i = 0;
    /**
     * Act - do whatever the EMOA wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {

        int x = getX();
        int y = getY();
            if( Greenfoot.isKeyDown( "left" ) ){
               animateLeft();
               setLocation( x-3,y );
               
            }
            if( Greenfoot.isKeyDown( "right" ) ){
               animateRight();
               setLocation( x+3,y );
               
              }
            if( Greenfoot.isKeyDown( "up" ) ){
               animateUp(); 
               setLocation( x,y-3 );
              
            }
            if( Greenfoot.isKeyDown( "down" ) ){
              animateDown();
              setLocation( x,y+3 );
               
            }
        }// Add your action code here.
        
   public void animateLeft(){
       if(i == 0)
        {
            setImage("girlleft1.png");
        }
       else if(i == 10)
        {
            setImage("girlleft2.png");
        }
       else if(i == 20)
        {
            setImage("girlleft1.png");
        }
       else if(i == 30)
        {
            setImage("girlleft3.png");
        }
        else if(i == 40)
        {
            i = 0;
            return;
        }
        i++;
    }
    
    public void animateRight(){
        if(i == 0)
        {
            setImage("girlright1.png");
        }
      else if(i == 10)
        {
            setImage("girlright2.png");
        }
       else if(i == 20)
        {
            setImage("girlright1.png");
        }
       else if(i == 30)
        {
            setImage("girlright3.png");
        }
        else if(i == 40)
        {
            i = 0;
            return;
        }
        i++;
    }
    
    public void animateUp(){
        if(i == 0)
        {
            setImage("girlback1.png");
        }
       else if(i == 10)
        {
            setImage("girlback2.png");
        }
       else if(i == 20)
        {
            setImage("girlback1.png");
        }
       else if(i == 30)
        {
            setImage("girlback3.png");
        }
        else if(i == 40)
        {
            i = 0;
            return;
        }
        i++;
    }
    public void animateDown(){
        if(i == 0)
        {
             setImage("girlfront1.png");
        }
       else if(i == 10)
        {
            setImage("girlfront2.png");
        }
       else if(i == 20)
        {
            setImage("girlfront1.png");
        }
       else if(i == 30)
        {
            setImage("girlfront3.png");
        }
        else if(i == 40)
        {
            i = 0;
            return;
        }
        i++;
    }

    }    


