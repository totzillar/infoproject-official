import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot und MouseInfo)

/**
 * Ergänzen Sie hier eine Beschreibung für die Klasse tür.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class tür extends Actor
{
    /**
     * Act - tut, was auch immer tür tun will. Diese Methode wird aufgerufen, 
     * sobald der 'Act' oder 'Run' Button in der Umgebung angeklickt werden. 
     */
    public void act() 
    {
        berühren();
    }  
    
    public void berühren()
        {
          GreenfootImage bild;  
            
          Actor a = getOneIntersectingObject(Detektiv.class);
          if (a !=null)
          {
             bild = new GreenfootImage("durchsichtig1.png");
             setImage(bild);
          }else{
              bild = new GreenfootImage("tür.png");
              setImage(bild);
            }
          
    }
}