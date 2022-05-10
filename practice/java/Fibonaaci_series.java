import java.lang.*;
import java.util.*;

class Fibonaaci_series
{
	static int F_series(int a)
	{
		int prev=1,prev_prev=1,temp,sum=2;
		System.out.print("1   1");
		for(int i=1;i<a-1;i++)
		{
			temp=(prev+prev_prev);
			System.out.print("   "+temp);
			sum=sum+temp;
			prev_prev=prev;
			prev=temp;	
		}
		System.out.println();
		System.out.println("The sum of the given series = "+sum);
		return 0;
	}

	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number : ");
		int n = sc.nextInt();
		F_series(n);
	}
}