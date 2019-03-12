import greenfoot.*;

/**
 * Write a description of class Innocent here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Innocent extends Actor
{
    public int xInnocent;
    public int yInnocent;
   
    /**
     * Act - do whatever the Innocent wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        randomMovement();
        check();
    }  
    public void randomMovement()
    {
        //MEthode für das Zufällige Bewegen des Gegners
        {
        move(1);
        if (Greenfoot.getRandomNumber(100) < 10)
        {
            turn(Greenfoot.getRandomNumber(90) - 45);
            
        } 
        if (getX() <=5 || getX() >= getWorld().getWidth() - 5)
        {
            turn(90);
            
        }
        if (getY() <=5 || getY() >= getWorld().getHeight() - 5)
        {
            turn(90);
            
          
        }
    }
    //checkt ob eine Wand in der nähe ist
    if (isTouching(wand.class))
                 {
                 
                 
                 turn(180);
                 move (2);
                 Greenfoot.delay(10);
             }
           }
    public void check()
        {
          Actor a = getOneIntersectingObject(Detektiv.class);
          if (a !=null)
          {
             this.getWorld().removeObject(this); 
          }
    }
}
