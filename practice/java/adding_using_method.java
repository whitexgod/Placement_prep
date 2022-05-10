import java.lang.*;
import java.util.*;

class add
{
	
	double number1;
	double number2;

	void value_declaration(double n1, double n2)
	{
		number1=n1;
		number2=n2;
	}

	void add_num()
	{
		System.out.println("The addition result is : "+ (number1+number2));
	}
}

class adding_using_method
{
	public static void main(String args[])
	{	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first number : ");
		double n1 = sc.nextDouble();
		System.out.println("Enter the second number : ");
		double n2 = sc.nextDouble();

		add obj = new add();

		obj.value_declaration(n1,n2);
		obj.add_num();
	}
}