import java.lang.*;
import java.util.*;

class array2
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no. of rows : ");
		int r = sc.nextInt();
		System.out.println("Enter the no. of columns : ");
		int c = sc.nextInt();
		
		int x[][] = new int[r][c];

		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				System.out.println("Enter the value of x["+i+"]["+j+"] : ");
				x[i][j] = sc.nextInt();
			}
		}
		
		System.out.println();
		System.out.println();
		
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				System.out.print(x[i][j]+"  ");
			}
		System.out.println();
		}
	}
}	