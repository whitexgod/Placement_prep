import java.lang.*;
import java.util.*;

class array
{	
	int r;
	int sum=0;
	
	void get_val(int x[])
	{
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<r;i++)
		{
			System.out.println("Enter the value of x["+i+"] : ");
			x[i] = sc.nextInt();
		}
	}
	
	
	void compute(int x[])
	{
		for(int i=0;i<r;i++)
		{
			sum=sum+x[i];
		}
		System.out.println("The sum of all the elements in the array is :"+sum);
	}
}

class array3
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no. of elements in the array : ");
		System.out.println();
		int r = sc.nextInt();	
		int x[] = new int[r];

		array obj = new array();
		obj.r = r;
		obj.get_val(x);
		obj.compute(x);
	}
}	