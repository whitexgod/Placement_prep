import java.lang.*;
import java.util.*;

class Fact
{	
	Fact()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int number = sc.nextInt();
		int F=1;
		for(int i=1;i<=number;i++)
		{
			F=F*i;
		}
		System.out.println("The Factorial of the number"+number+" is : "+F);
	}
}

class Factorial_const
{
	public static void main(String args[])
	{	
		Fact f1 = new Fact();
	}
}