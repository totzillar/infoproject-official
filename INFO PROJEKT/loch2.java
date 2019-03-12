
import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot und MouseInfo)

/**
 * Ergänzen Sie hier eine Beschreibung für die Klasse loch2.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class loch2 extends Actor
{
    /**
     * Act - tut, was auch immer loch2 tun will. Diese Methode wird aufgerufen, 
     * sobald der 'Act' oder 'Run' Button in der Umgebung angeklickt werden. 
     */
    public void act() 
    {
        untenGehen();
        obenGehen();
        rechtsGehen();
        linksGehen();
        // Ergänzen Sie Ihren Quelltext hier...
    }
     public loch2()
    {
        this.getImage().scale(2000,2000);
        //Skalierung
    }
    //Steuerung des Lochs bzw. FOG of WAR
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
}
