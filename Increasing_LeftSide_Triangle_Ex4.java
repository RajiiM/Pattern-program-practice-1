//Output
5 
5 4 
5 4 3 
5 4 3 2 
5 4 3 2 1 
//

public class Increasing_LeftSide_Triangle_Ex4 {

	public static void main(String[] args) 
	{
		for(int row = 5;row >= 1;row--)
		{
			for (int col = 5; col >= row; col--) 
			{
				System.out.print(col + " ");
			}
			System.out.println();
		}
	}
}

//---------Idea 1-----------//
public class Increasing_LeftSide_Triangle_Ex4 {

	public static void main(String[] args) 
	{
			for (int col = 5; col >= 5; col--) 
			{
				System.out.print(col + " ");
			}
			System.out.println();
			for (int col = 5; col >= 4; col--) 
			{
				System.out.print(col + " ");
			}
			System.out.println();
			for (int col = 5; col >= 3; col--) 
			{
				System.out.print(col + " ");
			}
			System.out.println();
			for (int col = 5; col >= 2; col--) 
			{
				System.out.print(col + " ");
			}
			System.out.println();
			for (int col = 5; col >= 1; col--) 
			{
				System.out.print(col + " ");
			}
			System.out.println();
	}
}

//-------------Idea 2-------------------//
public class Increasing_LeftSide_Triangle_Ex4 {

	public static void main(String[] args) 
	{
		int row = 5;
		while (row >= 1) 
		{
			for (int col = 5; col >= row; col--) 
			{
				System.out.print(col + " ");
			}
			System.out.println();
			row--;
		}
	}
}
