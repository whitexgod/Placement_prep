import java.lang.*;
import java.util.*;

class User_defined
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int a,b,total;
		System.out.println("Enter a number numbers : ");
		a=sc.nextInt();
		System.out.println("Enter another numbers : ");
		b=sc.nextInt();
		total=a+b;
		System.out.println("The sum of the given two numbers = "+total);
	}
}