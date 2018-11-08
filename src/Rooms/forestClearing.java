package Rooms;

import People.Pet;
import People.Person;

public class forestClearing extends Room {
    Person occupant;
    int xLoc,yLoc;
    int petbond = 0;
    String str = "clearing";

    public String getStr()
    {
        return this.str;
    }
    //petbond can I use it from another class without passing it somewhere

    public forestClearing(int x, int y)
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

    public void bondPet(Pet p)
    {
        petbond++;
        if(petbond <= 0)
        {
            System.out.println(p.name + " is nervous around you still, but appreciates the effort.");
        }
        if(petbond > 2 && petbond < 5)
        {
            System.out.println(p.name + " is having fun! It seems to like you. It is ready to help you.");
        }
        if(petbond > 5)
        {
            System.out.println(p.name + " is filled with joy! It headbutts your hand to be pet more.");
        }
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
