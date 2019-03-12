
import greenfoot.*;

/**
 * Write a description of class Detektiv here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Detektiv extends Actor
{
    public int level;
    public int xDetektiv;
    public int yDetektiv;
    public int rotation;
   
    private boolean spaceDown;
    
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

        check2();
        checkFire1();
    }
    
    public void checkFire()
    {
       if(Greenfoot.isKeyDown("space") )
       //&& dorsch ==0 );
       {
           
           getWorld().addObject(new Bullet(), getX(), getY());
           Greenfoot.delay(100);
           //dorsch=0;
           //int rotation = getRotation();
           //System.out.println(rotation);
      }
        }
    public void checkFire1()
    {
        if (!spaceDown && Greenfoot.isKeyDown("space"))
        {
                spaceDown = true;
                getWorld().addObject(new Bullet(), getX(), getY());
        }
        if (spaceDown && !Greenfoot.isKeyDown("space"))
        {
        spaceDown = false;
        
        }
    
    }   
     public Detektiv()
    {
        this.getImage().scale(50,50);
        
    }
    public void linksGehen()
    {
       if (Greenfoot.isKeyDown("a"))
       {
         setLocation(getX()-2, getY());
           
         if (isTouching(wand.class))
             {
                 
                 setLocation(getX()+1, getY());
     
         }
        
       }  
        if (isTouching(Zielfeld.class))
             {
               level = +1;
         }
    }
     public void rechtsGehen()
    {
        if (Greenfoot.isKeyDown("d"))
        {
        setLocation(getX()+2, getY());
     
     
            if (isTouching(wand.class))
            {
      
                setLocation(getX()-1, getY());
     
            }
        
        
     

            if (Greenfoot.isKeyDown("d"))
            {
                setLocation(getX()+1, getY());  

            }
     }
    }
        
    public void obenGehen()
        {
           if (Greenfoot.isKeyDown("w"))
           {
               setLocation(getX(), getY()-2);
        
               if (isTouching(wand.class))
        {
         
         setLocation(getX(), getY()+1);
     
       }
        }  
    }
    public void untenGehen()
    {
       if (Greenfoot.isKeyDown("s"))
       {
         setLocation(getX(), getY()+2);
         
         if (isTouching(wand.class))
         {
             
             setLocation(getX(), getY()-1);
     
          }
       }  
    }

    

    public void drehen()
    {
            MouseInfo mouse = Greenfoot.getMouseInfo();
            if(mouse != null) {
                setRotation((int)(180*Math.atan2(mouse.getY()-getY(),mouse.getX()-getX())/Math.PI));
        
            }
    }


    public void check2()
    {
     xDetektiv = this.getX();
     yDetektiv = this.getY();   
   
    }

}
