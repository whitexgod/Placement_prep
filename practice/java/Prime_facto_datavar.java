import java.lang.*;
import java.util.*;

class PF
{	
	int a;

	int check_prime()
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

	int Facto()
	{
		int F=1;
		for(int i=1;i<=a;i++)
		{
			F=F*i;
		}
		return F;
	}
}

class Prime_facto_datavar
{

	public static void main(String args[])
	{
		PF obj = new PF();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number : ");
		int n = sc.nextInt();
		obj.a = n;
		System.out.println("Enter 1 to pefom prime check.");
		System.out.println("Enter 2 to find factorial.");
		System.out.println("Enter 3 to pefom prime check and find factorial.");
		int in = sc.nextInt();
		if(in==1)
		{
			obj.check_prime();
		}
		else if(in==2)
		{
			int result=obj.Facto();
			System.out.println("The Factorial of the given number is : "+result);
		}
		else if(in==3)
		{
			obj.check_prime();
			System.out.println("The Factorial of the given number is : "+obj.Facto());
		}
		else
		{
			System.out.println("INCORRECT CHOICE");
		}
	}
}