import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Rocket is a rocket that can be controlled by the arrow keys and
 * shoot Projectile objects.
 * 
 * @author (your name) 
 * @version 1.0
 */
public class Rocket extends Actor
{
    // references to other objects that our rocket needs to use
    private HealthBar healthbar;
    private Asteroid lastAsteroidHit;
    
    /**
     * Since our rocket is controlled by the arrow keys, the only thing that we need
     * to do in the act method is check on which keys are pressed.
     */
    public void act() 
    {
        checkKeys();
        checkFireKey();
        checkForAsteroid();
    }
    
    /**
     * checkKeys checks the keyboard keys and moves the rocket accordingly.
     */
    public void checkKeys()
    {
        if ( Greenfoot.isKeyDown("left") )
        {
            turn(-5);
        }
        if ( Greenfoot.isKeyDown("up") )
        {
            move(5);
        }
        if ( Greenfoot.isKeyDown("right") )
        {
            turn(5);
        }
    }
    
    /**
     * This method checks if the fire key is pressed. If the fire key is pressed,
     * it will call the fireProjectile() method.
     */
    public void checkFireKey()
    {
        String key = Greenfoot.getKey();
        if (key != null)
        {
            if ( key.equals("space") )
            {
                fireProjectile();
            }
        }
    }
    
    /**
     * Check if we're hitting an asteroid.
     */
    public void checkForAsteroid()
    {
        Asteroid asteroid = (Asteroid) getOneObjectAtOffset(10, 10, Asteroid.class);
        if ( asteroid != null )
        {
            subtractHealth();
        }
    }

    /**
     * This method creates a new Projectile object, and fires it in the direction
     * that this rocket is pointing in.
     */
    public void fireProjectile()
    {
        // make a new projectile
        Projectile proj = new Projectile();
        // tell my projectile to set its rotation to the rotation of the rocket
        proj.setRotation( getRotation() );
        // get my world
        World world = getWorld();
        // add the projectile to the world
        world.addObject(proj, getX(), getY());
    }
    
    /**
     * This method calls our health bar's subtractHealth() method.
     */
    public void subtractHealth()
    {
        healthbar.subtractHealth(1);
    }
    
    /**
     * This is a "setter". It is a method that takes one input - a reference to a
     * HealthBar object - and sets our local reference to that object. 
     */
    public void setHealthBar(HealthBar hb)
    {
        healthbar = hb;
    }
}
