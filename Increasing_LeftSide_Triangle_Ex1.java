//Output
1 
1 2 
1 2 3 
1 2 3 4 
1 2 3 4 5 
//

public class Increasing_LeftSide_Triangle_Ex1 {

	public static void main(String[] args) 
	{
		for (int row = 1; row <= 5; row++) 
		{
			for (int col = 1; col <= row; col++) 
			{
				System.out.print(col + " ");
			}
			System.out.println();
		}
	}
}

//-----------Idea 1-------------//

public class Increasing_LeftSide_Triangle_Ex1 {

	public static void main(String[] args) {
    for(int col = 1; col<=1; col++)
    {
    	System.out.print(col + " ");
    }
    System.out.println();
    for(int col = 1; col<=2; col++)
    {
    	System.out.print(col + " ");
    }
    System.out.println();
    for(int col = 1; col<=3; col++)
    {
    	System.out.print(col + " ");
    }
    System.out.println();
    for(int col = 1; col<=4; col++)
    {
    	System.out.print(col + " ");
    }
    System.out.println();
    for(int col = 1; col<=5; col++)
    {
    	System.out.print(col + " ");
    }
    System.out.println();
	}
}

//-------------Idea 2--------------------//
public class Increasing_LeftSide_Triangle_Ex1 {

	public static void main(String[] args) 
	{
		int row = 1;
		while(row <= 5) 
		{
			for (int col = 1; col <= row; col++) 
			{
				System.out.print(col + " ");
			}
			System.out.println();
			row++;
		}
	}
}