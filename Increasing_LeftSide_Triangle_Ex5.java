//Output
5 
4 5 
3 4 5 
2 3 4 5 
1 2 3 4 5 
//

public class Increasing_LeftSide_Triangle_Ex5 {

	public static void main(String[] args) 
	{ 
		for (int row = 5;row>=1;row--)
		{
			for(int col = row; col <= 5; col++)
			{
				System.out.print(col + " ");
			}
			System.out.println();
		}
	}
}

//-------------Idea 1-------------//
public class Increasing_LeftSide_Triangle_Ex5 {

	public static void main(String[] args) 
	{
			for(int col = 5; col <= 5; col++)
			{
				System.out.print(col + " ");
			}
			System.out.println();
			for(int col = 4; col <= 5; col++)
			{
				System.out.print(col + " ");
			}
			System.out.println();
			for(int col = 3; col <= 5; col++)
			{
				System.out.print(col + " ");
			}
			System.out.println();
			for(int col = 2; col <= 5; col++)
			{
				System.out.print(col + " ");
			}
			System.out.println();
			for(int col = 1; col <= 5; col++)
			{
				System.out.print(col + " ");
			}
			System.out.println();
	}
}

//----------------Idea 2------------------//
public class Increasing_LeftSide_Triangle_Ex5 {

	public static void main(String[] args) 
	{ 
		int row = 5;
		while(row>=1)
		{
			for(int col = row; col <= 5; col++)
			{
				System.out.print(col + " ");
			}
			System.out.println();
			row--;
		}
	}
}