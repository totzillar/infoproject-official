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
           
           destroyEnemies();
           
        }
        public void drehenBullet()
        {
            //dreht die Bullet auf den Mauszeiger     
            MouseInfo mouse = Greenfoot.getMouseInfo();
                //for (int i = 0; i < 1; i++){ 
                if(mouse != null && Greenfoot.isKeyDown("space"))//methode wand adden und leertaste gedrückt) 
                {
                    setRotation((int)(180*Math.atan2(mouse.getY()-getY(),mouse.getX()-getX())/Math.PI));
                    //move(10);
                    
                }
                move(10);
                
        }
     
    public void checkBoundaries()
   {
       // diese Methode checkt die Grenzen der Welt
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
       // Diese Methode löscht die Gegner durch die Bullet, sowie das der Schuß
       
       Actor Innocent = getOneIntersectingObject(Innocent.class);
       if(Innocent != null) {
            getWorld().removeObject(Innocent);
            getWorld().removeObject(this);
       }
       // nicht durch die Wand geht
       Actor wand = getOneIntersectingObject(wand.class);
       if(wand != null) {
            
            getWorld().removeObject(this);
       }
       
   }
   //Geschwindigkeit des Schusses
   private int speed = 10;
}