import greenfoot.*; 

/**
 * The Turtle class describes the behavior of all turtle objects.
 * @author Keshav Saharia
 */
public class Turtle extends Animal
{   
    /**
     * When a Turtle acts, it moves.
     */
    public void act()
    {
        move(6);
        if ( atWorldEdge() )
        {
            turn(7); 
        }
        if (canSee(Lettuce.class))
        {
            eat(Lettuce.class);
        }
        
    }
}

