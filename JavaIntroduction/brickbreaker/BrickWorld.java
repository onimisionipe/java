import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class BrickWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BrickWorld extends World
{
    private ScoreCounter counter;
    
    /**
     * Constructor for the BrickWorld.
     */
    public BrickWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(400, 600, 1); 
        // Add the default beginning objects to the world.
        prepare();
    }

    /**
     * Tells the ScoreCounter object in the BrickWorld to add an amount to the score.
     */
    public void addScore(int amount)
    {
        counter.addScore(amount);
    }
    
    /**
     * Creates the bricks for this world.
     */
    public void createBricks()
    {
        // give my variable x an initial value of 50
        int x = 50;
        // while x is less than 400, do the instructions inside the brackets
        while ( x < 400 )
        {
            int y = 50;
            
            while (y < 150)
            {
                // add a new red brick at the position described by (x, 50)
                addObject(new RedBrick(), x, y);
                y = y + 30;
            }
            
            // add 50 to x
            x = x + 50;
        }
    }
    
    /**
     * Prepare the world for the start of the program. That is: create the initial
     * objects and add them to the world.
     */
    private void prepare()
    {
        // Create the paddle.
        Paddle paddle = new Paddle();
        addObject(paddle, 200, 550);
        paddle.spawnBall();
        // Create the score counter.
        counter = new ScoreCounter();
        addObject(counter, 100, 0); 
        // Create the bricks
        createBricks();
    }
}
