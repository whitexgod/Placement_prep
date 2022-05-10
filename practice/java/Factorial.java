import java.lang.*;
import java.util.*;

class Factorial
{
	public static void main(String args[])
	{	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int n = sc.nextInt();
		int F=1;
		for(int i=1;i<=n;i++)
		{
			F=F*i;
		}
		System.out.println("The Factorial of the given number is : "+F);
	}
}