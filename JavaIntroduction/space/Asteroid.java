import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Asteroid is a moving target in the world that you have to shoot with projectiles
 * from your rocket, and avoid getting hit by.
 * 
 * @author (your name) 
 * @version 1.0
 */
public class Asteroid extends Actor
{
    /**
     * An Asteroid can move around in as simple or as complex a way as you want.
     */
    public void act() 
    {
        
    }
    
    /**
     * This method takes the image of the Asteroid object, and shrinks it by scaling
     * it down by a certain amount. If the Asteroid is too small to shrink any further, 
     * it should call the destroy() method.
     */
    public void shrink()
    {
        // get the image into a variable
        GreenfootImage image = getImage();
        // make a new width and height for the image
        int x = image.getWidth() - 10;
        int y = image.getHeight() - 10;
        // if the width and height are valid for a new image
        if (x > 0 && y > 0)
        {
            // then scale the image to the new width and height
            image.scale(x, y);
        }
        else
        {
            // otherwise, destroy the asteroid
            destroy();
        }
    }
    
    /**
     * Destroys this asteroid by removing it from the world.
     */
    public void destroy()
    {
        World w = getWorld();
        w.removeObject(this);
    }
}