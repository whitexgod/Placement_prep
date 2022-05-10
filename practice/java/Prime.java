import java.lang.*;
import java.util.*;

class Prime
{
	static int check_prime(int a)
	{
		int c = 0;
		for(int i=1;i<=a;i++)
		{
			if(a%i==0)
			{
				c++;
			}
		}
		if(c==2)
			System.out.println("Prime Number");
		else
			System.out.println("Not a Prime Number");
		return 0;
	}

	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number : ");
		int n = sc.nextInt();
		check_prime(n);
	}
}