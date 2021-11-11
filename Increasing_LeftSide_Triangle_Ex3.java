//Output
5 
4 4 
3 3 3 
2 2 2 2 
1 1 1 1 1 
//

public class Increasing_LeftSide_Triangle_Ex3 {

	public static void main(String[] args) 
	{
		for (int row = 5; row >= 1; row--) 
		{
			for (int col = 5; col >= row; col--) 
			{
				System.out.print(row + " ");
			}
			System.out.println();
		}
	}
}


//-----------Idea 1--------------//
public class Increasing_LeftSide_Triangle_Ex3 {

	public static void main(String[] args) 
	{
			for (int col = 5; col >= 5; col--) 
			{
				System.out.print(5 + " ");
			}
			System.out.println();
			for (int col = 5; col >= 4; col--) 
			{
				System.out.print(4 + " ");
			}
			System.out.println();
			for (int col = 5; col >= 3; col--) 
			{
				System.out.print(3 + " ");
			}
			System.out.println();
			for (int col = 5; col >= 2; col--) 
			{
				System.out.print(2 + " ");
			}
			System.out.println();
			for (int col = 5; col >= 1; col--) 
			{
				System.out.print(1 + " ");
			}
			System.out.println();
	}
	}

//-----------Idea 2---------------//
public class Increasing_LeftSide_Triangle_Ex3 {

	public static void main(String[] args) 
	{
		int row = 5;
		while(row>=1)
		{
			for (int col = 5; col >= row; col--) 
			{
				System.out.print(row + " ");
			}
			System.out.println();
			row--;
		}
	}
	}