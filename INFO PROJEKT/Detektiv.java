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
    public void jaGehen()
    {
       if (Greenfoot.isKeyDown("left"))
       {
         setLocation(getX()-1, getY());
         setRotation (getRotation() -5);
       }  
       if (Greenfoot.isKeyDown("right"))
       {
         setLocation(getX()+1, getY());
         setRotation (getRotation() +5);
       }  
       move(3);
       if ("space".equals(Greenfoot.getKey()))
        {
         fire();
        }    
    }
    public void obenGehen()
    {
       if (Greenfoot.isKeyDown("up"))
       {
         setLocation(getX(), getY()-1);
        
       }  
    }
    public void untenGehen()
    {
       if (Greenfoot.isKeyDown("down"))
       {
         setLocation(getX(), getY()+1);
         
       }  
    }
    private void fire()
    {
       Steel steel = new Steel();
       getWorld().addObject(steel, getX(), getY());
       steel.setRotation(getRotation());
       steel.move(40.0);
   
    }
}
