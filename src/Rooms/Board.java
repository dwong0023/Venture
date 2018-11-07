package Rooms;

public class Board {
    Room[][] map;
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

    public void printBoard()
    {
        String cell = "j";
        for(int i = 0; i < map.length; i++)
        {
            for (int k = 0; k < map.length; k++)
            {
                System.out.print(cell);
            }
            System.out.println();
        }
    }
}
