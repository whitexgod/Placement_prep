import java.lang.*;
import java.util.*;

class Largest_of_three
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int a,b,c;
		System.out.println("Enter first numbers : ");
		a=sc.nextInt();
		System.out.println("Enter second numbers : ");
		b=sc.nextInt();
		System.out.println("Enter third numbers : ");
		c=sc.nextInt();
		if((a>b) && (a>c))
		{
			System.out.println("The Largest is first number "+a);
		}
		else if((b>a) && (b>c))
		{
			System.out.println("The Largest is second number "+b);
		}
		else if((c>a) && (c>b))
		{
			System.out.println("The Largest is third number "+c);
		}
		else
		{
			System.out.println("All are equal");
		}
	}
}