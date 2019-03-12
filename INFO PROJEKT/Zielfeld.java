import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot und MouseInfo)

/**
 * Ergänzen Sie hier eine Beschreibung für die Klasse Zielfeld.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class Zielfeld extends Actor
{
    /**
     * Act - tut, was auch immer Zielfeld tun will. Diese Methode wird aufgerufen, 
     * sobald der 'Act' oder 'Run' Button in der Umgebung angeklickt werden. 
     */
    public void act() 
    {
        ziel();
    }    
    
    public Zielfeld()
    {
      this.getImage().scale(30,30);   
    }
    public void ziel()
    {
        if (isTouching(Detektiv.class))
        {
            Greenfoot.stop();
        }
    }
}