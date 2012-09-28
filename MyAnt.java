



import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.*;
/**
 * A full implementation of an ant that by considering
 * other objects as repelling or attracting forces is able to:
 * (1) Avoid running into the wall.
 * Add as your progress...
 * 
 * @author Author
 * @version Version
 */

public class MyAnt extends Ant
{
 
    private double wallFactor = 10;

     /**
     * Find out which forces are effecting the ant.
     * (1) Avoid running into the wall.
     * Add as your progress...
     * 
     */
    public Vector getForces() {
        Vector f = new Vector();     
        f = f.add(avoidWall());
        return f;
    }
    
    
    /**
     * Avoid moving into any of the walls.
     * Walls that a close should be avoided more rapidly than walls far away.
     * @return a vector that points away from the nearest walls.
     */
    
    private Vector avoidWall() {
        Vector wallV = new Vector();
        wallV = wallV.add(new Vector(0, 1/distanceToTopWall())); // avoid top wall 

        // avoid bottom wall, not yet implemented

        // avoid left wall, not yet implemented

        wallV = wallV.add(new Vector(-1/distanceToRightWall(),0)); // avoid right wall
        
        return wallV.scale(wallFactor);
    }   
    
    public String getCreator(){
        return "Unknown";
    }

}   
