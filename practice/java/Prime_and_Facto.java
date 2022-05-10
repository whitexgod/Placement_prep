import java.lang.*;
import java.util.*;

class PF
{	
	int check_prime(int n)
	{
		int c = 0;
		for(int i=1;i<=n;i++)
		{
			if(n%i==0)
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

	int Facto(int n)
	{
		int F=1;
		for(int i=1;i<=n;i++)
		{
			F=F*i;
		}
		return F;
	}
}

class Prime_and_Facto
{

	public static void main(String args[])
	{
		PF obj = new PF();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number : ");
		int n = sc.nextInt();
		obj.check_prime(n);
		int result=obj.Facto(n);
		System.out.println("The Factorial of the given number is : "+result);
	}
}