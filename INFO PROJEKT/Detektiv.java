import greenfoot.*;

/**
 * Write a description of class Detektiv here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Detektiv extends Actor
{
    /**
     * Act - do whatever the Detektiv wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private int delay;
    private static final int MAX_DELAY = 2;
    public void act() 
    {
            if (delay < MAX_DELAY) {
            delay++;
            return;
        } else {
            delay = 0;
        }
        linksGehen();
        rechtsGehen();
        obenGehen();
        untenGehen();
        drehen();
    
    }    
    public void linksGehen()
    {
       if (Greenfoot.isKeyDown("a"))
       {
         setLocation(getX()-1, getY());
         
       }  
    }
     public void rechtsGehen()
    {
       if (Greenfoot.isKeyDown("d"))
       {
         setLocation(getX()+1, getY());  
    }
    }
    public void obenGehen()
    {
       if (Greenfoot.isKeyDown("w"))
       {
         setLocation(getX(), getY()-1);
        
       }  
    }
    public void untenGehen()
    {
       if (Greenfoot.isKeyDown("s"))
       {
         setLocation(getX(), getY()+1);
         
       }  
    }
    
    public void drehen()
    {
            MouseInfo mouse = Greenfoot.getMouseInfo();
            if(mouse != null) {
                setRotation((int)(180*Math.atan2(mouse.getY()-getY(),mouse.getX()-getX())/Math.PI));
        
            }
    }
}
