import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class EndingApple here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class EndingApple extends Apple
{
    /**
     * Act - do whatever the EndingApple wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        int x =getX();
        int y= getY()+2;

        setLocation(x,y);
        MyWorld world = (MyWorld) getWorld();
        
        if(getY()>=world.getHeight())
        {
            world.removeObject(this);
            world.applesCount-=1;
            if (world.applesCount<=0)
            {
            world.gameOver();
            }
        }
        if(waveEnd()){
            world.gamePhase="normal";
        }
    }
    public boolean waveEnd()
    {
        return getY()>=0;
    }
}