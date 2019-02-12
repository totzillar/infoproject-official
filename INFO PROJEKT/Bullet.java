import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot und MouseInfo)

/**
 * Ergänzen Sie hier eine Beschreibung für die Klasse Bullet.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class Bullet extends Actor
{
    /**
     * Act - tut, was auch immer Bullet tun will. Diese Methode wird aufgerufen, 
     * sobald der 'Act' oder 'Run' Button in der Umgebung angeklickt werden. 
     */
    public void act() 
    {
        move(10);
        //Monster mon = (Monster)getOneIntersectingObject(Monster.class);
        //if(getY() > 395 || getY() < 5 || getX() > 595 || getX() < 5)
         //   getWorld().removeObject(this);
        //if(mon != null && !mon.dead && this != null && getWorld() != null) {
          //  getWorld().removeObject(this);
          //  mon.health--;
          //  mon.hit(Player.getGun().damage);
        }  
     
    public void shoot()
    {
        if (Greenfoot.isKeyDown("Space"))
        {
            getWorld().addObject(new Bullet());
            move (10);
        }
    }
}

