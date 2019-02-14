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
        //int move = 0 + (int)(Math.random()*((20-0)+1));
        //int a = 0 + (int)(Math.random()*((4-0)+1));
        //int j = 0;
        //if(move == 5)
        //{
            //if( a == 1){

               animateLeft();
               if(x-2 >= 75)
               {
                   setLocation( x-2,y );
                   //x = getX();
                                      setLocation( x-2,y );
                   //x = getX();
                                      setLocation( x-2,y );
                  // x = getX();
                                      setLocation( x-2,y );
                   //x = getX();
                                      setLocation( x-2,y );
                   //x = getX();
               }
for(j=0; j<1000; j++)
{
}
            //}
            //else if( a == 2){
               //for(j=0; j<50; j++)
               //{
                   animateRight();
                   if(x+2 <= 590)
                   {
                       setLocation( x+2,y );
                       //x = getX();
                       setLocation( x+2,y );
                       //x = getX();
                       setLocation( x+2,y );
                       //x = getX();
                       setLocation( x+2,y );
                      // x = getX();
                       setLocation( x+2,y );
                       //x = getX();
                   }
               //}
           // }
           for(j=0; j<1000; j++)
{
}
            //else if( a == 3){
               //for(j=0; j<50; j++)
               //{
                   animateUp(); 
                   if(y-2 >= 100)
                   {
                       setLocation( x,y-2 );
                       //y = getY();
                       setLocation( x,y-2 );
                       //y = getY();
                       setLocation( x,y-2 );
                       //y = getY();
                                              setLocation( x,y-2 );
                      // y = getY();
                                              setLocation( x,y-2 );
                       //y = getY();
                   }
               //}
           // }
           for(j=0; j<1000; j++)
{
}
            //else if( a == 4 ){
              //for(j=0; j<50; j++)
              //{
                   animateDown();
                   if(y+2 <= 380)
                   {
                       setLocation( x,y+2 );    
                       //y = getY();
                       setLocation( x,y+2 );    
                       //y = getY();
                       setLocation( x,y+2 );    
                       //y = getY();
                       setLocation( x,y+2 );    
                       //y = getY();
                       setLocation( x,y+2 );    
                       //y = getY();

                   }
                   for(j=0; j<1000; j++)
{
}
                   animateIdle();
                   for(j=0; j<1000; j++)
{
}
                   j = 0;
        }
        //else
        //{

        //}


        
   public void animateLeft(){
       if(i == 0)
        {
            setImage("cat-side1.png");
        }
       else if(i == 10)
        {
            setImage("cat-side2.png");
        }
        else if(i == 20)
        {
            i = 0;
            return;
        }
        i++;
    }
    
    public void animateRight(){
        if(i == 0)
        {
            setImage("cat-side3.png");
        }
      else if(i == 10)
        {
            setImage("cat-side4.png");
        }
       else if(i == 20)
       {
            i = 0;
            return;
        }
        i++;
    }
    
    public void animateUp(){
        if(i == 0)
        {
            setImage("cat-back1.png");
        }
       else if(i == 10)
        {
            setImage("cat-back2.png");
        }
       else if(i == 20)
        {
            setImage("cat-back1.png");
        }
       else if(i == 30)
        {
            setImage("cat-back3.png");
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
             setImage("cat-front1.png");
        }
       else if(i == 10)
        {
            setImage("cat-front2.png");
        }
       else if(i == 20)
        {
            setImage("cat-front1.png");
        }
       else if(i == 30)
        {
            setImage("cat-front3.png");
        }
        else if(i == 40)
        {
            i = 0;
            return;
        }
        i++;
    } 
        public void animateIdle(){
        if(i == 0)
        {
             setImage("cat-idle.png");
        }
       else if(i == 10)
        {
            i = 0;
            return;
        }
        i++;
    } 
}
