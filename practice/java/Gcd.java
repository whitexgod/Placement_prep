import java.lang.*;
import java.util.*;

class Gcd
{
	//Function to find gcd
	static int find_gcd(int a,int b)
	{
		if(a==0)
			return b;
		else if(b==0)
			return a;
		else if(a==b)
			return a;
		else if(a>b)
			return find_gcd(a-b,b);
 		return find_gcd(a,b-a);
	}

	//main program body
	public static void main(String args[])
	{	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First number : ");
		int n1 = sc.nextInt();
		System.out.println("Enter Second number : ");
		int n2 = sc.nextInt();
		int result = find_gcd(n1,n2);
		System.out.println("The GCD = "+result);
	}
}