//Output
2 
4 4 
6 6 6 
8 8 8 8 
10 10 10 10 10 
//

public class Increasing_LeftSide_Triangle_Ex6 {

	public static void main(String[] args) 
	{ 
		for(int row = 1;  row<= 5; row++)
		{
			for(int col = 1; col <= row; col++)
			{
				System.out.print((row*2) + " ");
			}
			System.out.println();
		}
	}
}

//Basic Idea from Increasing_RightSide_Triangle_Ex3