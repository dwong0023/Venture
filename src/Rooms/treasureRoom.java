package Rooms;

import People.Person;

public class treasureRoom extends Room {
    Person occupant;
    int xLoc,yLoc;
    String str = "treasure";

    public String getStr()
    {
        return this.str;
    }

    public treasureRoom(int x, int y)
    {
        super(x, y);
    }

    /**
     * Method controls the results when a person enters this room.
     * @param x the Person entering
     */
    public void enterRoom(Person x)
    {
        System.out.println("You have entered a forest clearing. You can use this time to use items, bond with your teammates, or move on.");
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
