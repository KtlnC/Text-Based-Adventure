package floors;

public class FirstFloor extends Floor{
	
	private int row,column;
	public FirstFloor(int row, int column)
	{
		super(row,column);
	}
	public void print()
	{
		String map[][] = new String[column][row];
		for(int i = 0;i<map.length;i++)
		{
			for(int j = 0;j<map[i].length;j++)
			{
				System.out.print("[ ]");
			}
			System.out.println();
		}
	}
}
