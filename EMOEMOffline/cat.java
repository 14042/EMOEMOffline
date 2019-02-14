import greenfoot.*;

/**
 * Write a description of class cat here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class cat extends Actor
{
    private int i = 0;
    private int j = 0;
    /**
     * Act - do whatever the cat wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        int x = getX();
        int y = getY();
        int move = 0 + (int)(Math.random()*((20-0)+1));
        int a = 0 + (int)(Math.random()*((4-0)+1));
        //int j = 0;
        if(move == 5)
        {
            if( a == 1){
               for(j=0; j<50; j++)
               {
                   animateLeft();
                   if(x-2 >= 75)
                   {
                       setLocation( x-2,y );
                       x = getX();
                   }
               }
            }
            else if( a == 2){
               for(j=0; j<50; j++)
               {
                   animateRight();
                   if(x+2 <= 590)
                   {
                       setLocation( x+2,y );
                       x = getX();
                   }
               }
            }
            else if( a == 3){
               for(j=0; j<50; j++)
               {
                   animateUp(); 
                   if(y-2 >= 100)
                   {
                       setLocation( x,y-2 );
                       y = getY();
                   }
               }
            }
            else if( a == 4 ){
              for(j=0; j<50; j++)
              {
                   animateDown();
                   if(y+2 <= 380)
                   {
                       setLocation( x,y+2 );    
                       y = getY();
                   }
              }
            }
        }
        j = 0;
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
