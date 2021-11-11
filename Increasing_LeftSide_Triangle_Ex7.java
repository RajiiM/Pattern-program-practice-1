//Output
1 
2 3 
4 5 6 
7 8 9 10 
11 12 13 14 15 
//

public class Increasing_LeftSide_Triangle_Ex7 {

	public static void main(String[] args) 
	{ 
		int value = 1;
		for (int row = 1;row<=5;row++)
		{
			for(int col = 1; col <= row; col++)
			{
				System.out.print(value++ + " "); //explain below
			}
			System.out.println();
		}
	}
}

//
Explanation:
System.out.print(value++ + " ");
1st row = 1(2)
2nd row = 2(3) 3(4)
3rd row = 4(5) 5(6) 6(7)
4th row = 7(8) 8(9) 9(10) 10(11)
5th row = 11(12) 12(13) 13(14) 14(15) 15(16)
//

//------------Idea 1------------------//
public class Increasing_LeftSide_Triangle_Ex7 {

	public static void main(String[] args) 
	{ 
		for (int row = 1;row<=5;row++)
		{
			for(int col = 1; col <= row; col++)
			{
				System.out.print(col + " ");
			}
			System.out.println();
		}
	}
}

Output
1 
1 2 
1 2 3 
1 2 3 4 
1 2 3 4 5 
//

//------------Idea 2----------------//
public class Increasing_LeftSide_Triangle_Ex7 {

	public static void main(String[] args) 
	{ 
		int value = 1;
		for (int row = 1;row<=5;row++)
		{
			for(int col = 1; col <= row; col++)
			{
				System.out.print(value + " ");
			}
			System.out.println();
		}
	}
}

Output
1 
1 1 
1 1 1 
1 1 1 1 
1 1 1 1 1 
//

