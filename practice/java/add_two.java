import java.lang.*;
import java.util.*;

class addition
{
	/*addition() //defining constructor
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number : ");
		int n1 = sc.nextInt();
		System.out.println("Enter second number : ");
		int n2 = sc.nextInt();
		int result = n1 + n2;
		System.out.println("The addition = "+result);
	}*/

	
	addition(int n1, int n2) //defining constructor
	{
		int result = n1 + n2;
		System.out.println("The addition = "+result);
	}
}

class add_two
{
	public static void main(String args[])
	{	
		//Taking user inputs
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number : ");
		int n1 = sc.nextInt();
		System.out.println("Enter second number : ");
		int n2 = sc.nextInt();

		//addition a1 = new addition();    // without using parameter
		addition a1 = new addition(n1,n2); // using parameter 
	}
} 