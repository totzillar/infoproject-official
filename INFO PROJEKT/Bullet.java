import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot und MouseInfo)

/**
 * Ergänzen Sie hier eine Beschreibung für die Klasse Bullet.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class Bullet extends Actor
{
    public int rotation1;
    /**
     * Act - tut, was auch immer Bullet tun will. Diese Methode wird aufgerufen, 
     * sobald der 'Act' oder 'Run' Button in der Umgebung angeklickt werden. 
     */
    public void act() 
    {
        // Ergänzen Sie Ihren QuelltsetLocation(getX() + speed, getY());
       
       //setLocation(getX() + speed, getY());
       drehenBullet();
       checkBoundaries();
       destroyEnemies();
       
    }
    public void drehenBullet()
    {
             MouseInfo mouse = Greenfoot.getMouseInfo();
            if(mouse != null) {
                setRotation((int)(180*Math.atan2(mouse.getY()-getY(),mouse.getX()-getX())/Math.PI));
                setLocation(getX() + speed, getY());
       
            }
    }
    public void checkBoundaries()
   {
       if(getX() > getWorld().getWidth() - 1) 
            getWorld().removeObject(this);
       else if(getX() < 1) 
            getWorld().removeObject(this);
       if(getY() > getWorld().getHeight() - 1) 
            getWorld().removeObject(this);
       else if(getY() < 1) 
            getWorld().removeObject(this);
   }
   public void destroyEnemies()
   {
       //"Enemy" can be any class that you want the bullet to destroy. 
       Actor Innocent = getOneIntersectingObject(Innocent.class);
       if(Innocent != null) {
            getWorld().removeObject(Innocent);
            getWorld().removeObject(this);
       }
       
       
   }
   
   private int speed = 10;
}