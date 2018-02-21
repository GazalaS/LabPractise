import java.util.HashMap;
import java.util.Set;
/**
 * Class Room - a room in an adventure game.
 *
 * This class is part of the "World of Zuul" application. 
 * "World of Zuul" is a very simple, text based adventure game.  
 *
 * A "Room" represents one location in the scenery of the game.  It is 
 * connected to other rooms via exits.  The exits are labelled north, 
 * east, south, west.  For each direction, the room stores a reference
 * to the neighboring room, or null if there is no exit in that direction.
 * 
 * @author  Michael Kölling and David J. Barnes
 * @version 2016.02.29
 */
public class Room 
{
    
    private String description;
    //Replace by HashMap Excercise 8.8
    /* Exercise 8.6
    private Room northExit;
    private Room southExit;
    private Room eastExit;
    private Room westExit;*/
    private HashMap<String, Room> exits;        // stores exits of this room.

    /**
     * Create a room described "description". Initially, it has
     * no exits. "description" is something like "a kitchen" or
     * "an open court yard".
     * @param description The room's description.
     */
    public Room(String description) 
    {
        this.description = description;
        //added for Excercise 8.8
        exits = new HashMap<>();
    }

    /**
     * Define the exits of this room.  Every direction either leads
     * to another room or is null (no exit there).
     * @param north The north exit.
     * @param east The east east.
     * @param south The south exit.
     * @param west The west exit.
     */
    public Room getExit(String direction) 
    {
        /* Exercise 8.6
        if(direction.equals("north")){
            return northExit;
        }
        if(direction.equals("east")) {
            return eastExit;
        }
        if(direction.equals("south")) {
            return southExit;
        }
        if(direction.equals("west")) {
            return westExit;
        }
        return null;*/
        return exits.get(direction);
    }

    /**
     * @return The description of the room.
     */
    public String getDescription(String direction, Room neighbor)
    {
        return description;
    }
 
    public void setExit(String direction, Room neighbor)
    //public void setExits(Room north, Room east, Room south, Room west) 
    {
        /*if(north != null) {
            northExit = north;
        }
        if(east != null) {
            eastExit = east;
        }
        if(south != null) {
            southExit = south;
        }
        if(west != null) {
            westExit = west;
        }*/
        //Replace by HashMap Excercise 8.8
        exits.put(direction, neighbor);
    }
    /*Exercise 8.7
    public String getExitString(){
        
        String exitString = "Exits: ";
        if(northExit != null) {
            exitString += "north";
        }
        if(eastExit != null) {
            exitString += "east";
        }
        if(southExit != null) {
            exitString += "south";
        }
        if(westExit != null) {
            exitString += "west";
        }
        
        return exitString;
        
    }
*/  
    //added for Excercise 8.8
    public String getShortDescription()
    {
        return description;
    }
    
    //Added for Excercise 8.11
    public String getLongDescription()
    {
        return "You are " + description + ".\n" + getExitString();
    }
    //Added for Excercise 8.11
    private String getExitString()
    {
        String returnString = "Exits:";
        Set<String> keys = exits.keySet();
        for(String exit : keys) {
            returnString += " " + exit;
        }
        return returnString;
    }
}
