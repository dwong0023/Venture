package Rooms;
import People.Person;
import com.sun.javafx.image.BytePixelSetter;

public class Board {
    Room[][] map;
    String cell;

    public Board(Room[][] map)
    {
        this.map = map;
    }

    public Board(int height, int width)
    {
        map = new Room[height][width];
    }

    public void addRoom(Room room, int row, int col)
    {
        map[row][col] = room;
    }

    public void printBoard(Person player1)
    {
        for(int i = 0; i < map.length; i++)
        {
            for (int k = 0; k < map.length; k++)
            {
                if(player1.getxLoc()== i && player1.getyLoc() == k && map[i][k].getStr().compareTo("nothing") != 0)
                {
                    cell = "[P]";
                }
                if(player1.getxLoc()== i && player1.getyLoc() == k)
                {
                    cell = "[P]";
                }
                else if(map[i][k].getStr().equals("fight") || map[i][k].getStr().equals("win") || map[i][k].getStr().equals("treasure") )
                {
                    cell = "[!]";
                }
                else if(map[i][k].getStr().equals("clearing") || map[i][k].getStr().equals("event") )
                {
                    cell = "[?]";
                }
                else
                {
                    cell = "[ ]";
                }
                System.out.print(cell);
            }
            System.out.println();
        }
    }
}
