package Rooms;

import Game.Runner;
import People.Person;
import java.util.Scanner;

public class WinningRoom extends Room
{

    public WinningRoom(int x, int y) {
        super(x, y);

    }

    /**
     * Triggers the game ending conditions.
     * @param x the Person entering
     */
    @Override
    public void enterRoom(Person x) {

        occupant = x;
        x.setxLoc(this.xLoc);
        x.setyLoc(this.yLoc);
        System.out.println("You found the path leading to the ruins! Will you venture forth or return to explore?");
        Scanner endgame = new Scanner(System.in);
        String answer = endgame.next();
        if(answer.equals("venture forth")||answer.equals("venture"))
        {
            Runner.gameOff();
        }
    }


}
