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
    }

    
    
       
    public Detektiv()
    {
        //Skaliert den Detektiv.
        this.getImage().scale(50,50);
        
    }
    public void linksGehen()
    {
        //Läuft links.
       if (Greenfoot.isKeyDown("a"))
       {
         setLocation(getX()-2, getY());
           
         if (isTouching(wand.class))
             {
                 
                 setLocation(getX()+2, getY());
     
         }
        
       }  
        if (isTouching(Zielfeld.class))
             {
               level = +1;
         }
    }
     public void rechtsGehen()
    {
        //läuft rechts.
        if (Greenfoot.isKeyDown("d"))
        {
        setLocation(getX()+2, getY());
     
     
            if (isTouching(wand.class))
            {
      
                setLocation(getX()-2, getY());
     
            }
        
        
     }
    }
        
    public void obenGehen()
        {
            //läuft nach oben.
           if (Greenfoot.isKeyDown("w"))
           {
               setLocation(getX(), getY()-2);
        
               if (isTouching(wand.class))
        {
         
                setLocation(getX(), getY()+2);
     
         }
        }  
    }
    public void untenGehen()
    {
        //läuft nach unten.
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
            //Rotiert den Detektiv zum Mauszeiger.
            MouseInfo mouse = Greenfoot.getMouseInfo();
            if(mouse != null) {
                setRotation((int)(180*Math.atan2(mouse.getY()-getY(),mouse.getX()-getX())/Math.PI));
        
            }
    }


    public void check2()
    {
        //Checkt die Position des Detektivs.
     xDetektiv = this.getX();
     yDetektiv = this.getY();   
   
    }

    public void hinweisSammeln()
    {
        //Sammelt Hinweise in der Theorie auf.
        Actor hinweis = getOneObjectAtOffset(0, 0, hinweis.class);
        if(isTouching(hinweis.class))
        {
            getWorld().removeObject(hinweis);
        }
    }
}
