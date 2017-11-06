package board;
import floors.FirstFloor;
import floors.Floor;

public class Board {

	private int column, row, coordx, coordy;
	private String character;
	public Board(int x, int y)
	{
		this.row = x;
		this.column = y;
	}
	public Board(String player, int playerx, int playery, int column,int row)
	{
		this.character = player;
		this.coordx = playerx;
		this.coordy = playery;
		this.column = column;
		this.row = row;
	}
	public void updateMap(String c,int x,int y)
	{
		coordx = x;
		coordy = y;
		character = c;
		String map[][] = new String[column][row];
		for(int i = 0;i<map.length;i++)
		{
			for(int j = 0;j<map[i].length;j++)
			{
				map[i][j] = "[ ]";
				map[coordx][coordy] = "[" + character + "]";
				System.out.print(map[i][j]);
 			}
			System.out.println();
		}
	}
	public void printmap()
	{
		String map[][] = new String[column][row];
		for(int i = 0;i<map.length;i++)
		{
			for(int j = 0;j<map[i].length;j++)
			{
				map[i][j] = "[ ]";
				System.out.print(map[i][j]);
			}
			System.out.println();
		}
	}

}
