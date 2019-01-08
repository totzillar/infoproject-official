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
    public void act() 
    {
        linksGehen();
        rechtsGehen();
        obenGehen();
        untenGehen();
        
    
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
         Actor Agu = getOneObjectAtOffset(1, 0, wand.class) ;
         if ( Agu != null)
         {
             
            }
         else
         
         {
             setRotation(180);
             move(10);
             setRotation(0);
       }  
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
   
    }
