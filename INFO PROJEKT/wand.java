import greenfoot.*;

/**
 * Write a description of class wand here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class wand extends Actor
{
    /**
     * Act - do whatever the wand wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        
    }    
    public boolean onGround()
    {
        //Kreiert eine Hitbox für die Wand.
        Actor above = getOneObjectAtOffset (0, 30, wand.class);
        return above != null;
        
    }

}
