package Rooms;

import People.Person;

public class Room {
    Person occupant;
    int xLoc;
    int yLoc;
    String str = "nothing";

    public String getStr()
    {
        return this.str;
    }

    public Room(int x, int y)
    {
        xLoc = x;
        yLoc = y;
    }

    /**
     * Method controls the results when a person enters this room.
     * @param x the Person entering
     */
    public void enterRoom(Person x)
    {
        System.out.println("You venture deeper into the forest. There is no imminent danger here.");
        occupant = x;
        x.setxLoc(this.xLoc);
        x.setyLoc(this.yLoc);
    }

    /**
     * Removes the player from the room.
     * @param x
     */
    public void leaveRoom(Person x)
    {
        occupant = null;
    }

}
