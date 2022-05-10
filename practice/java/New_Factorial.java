import java.lang.*;
import java.util.*;

class Fact
{

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

class New_Factorial
{
	public static void main(String args[])
	{	
		Fact F1 = new Fact();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int n = sc.nextInt();
		int result = F1.Facto(n);
		System.out.println("The Factorial of the given number is : "+result);
	}
}