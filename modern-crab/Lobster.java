// WARNING: This file is auto-generated and any changes to it will be overwritten
import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class Lobster extends Actor
{

    /**
     * Act - do whatever the Lobster wants to do. This method is called whenever the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        move(4);
        if (Greenfoot.isKeyDown("left")) {
            turn(3);
        }
        if (Greenfoot.isKeyDown("right")) {
            turn(3);
        }
        Actor crab = (Crab)getOneObjectAtOffset(0, 0, Crab.class);
        if (crab != null) {
            getWorld().removeObject(crab);
        }
    }

    /**
     * 
     */
    public boolean foundCrab()
    {
        Actor crab = getOneObjectAtOffset(0, 0, Crab.class);
        return crab != null;
    }
}
