import java.lang.*;
import java.util.*;

class calculate_area_constructor_overloading
{
	calculate_area_constructor_overloading(int side)
	{
		System.out.println();
		System.out.println("Each side of the square is "+side+" cm");
		System.out.println("The area of the square is : "+(side*side)+" cm2");
	}
	calculate_area_constructor_overloading(int length, int breadth)
	{
		System.out.println();
		System.out.println("Length of the rectangle is "+length+" cm");
		System.out.println("Breadth of the ectangle is "+breadth+" cm");
		System.out.println("The area of the rectangle is : "+(length*breadth)+" cm2");
	}
}

class calculate_area_function_overloading
{
	void calculate_area(int side)
	{
		System.out.println();
		System.out.println("Each side of the square is "+side+" cm");
		System.out.println("The area of the square is : "+(side*side)+" cm2");
	}
	void calculate_area(int length, int breadth)
	{
		System.out.println();
		System.out.println("Length of the rectangle is "+length+" cm");
		System.out.println("Breadth of the ectangle is "+breadth+" cm");
		System.out.println("The area of the rectangle is : "+(length*breadth)+" cm2");
	}
}

class area
{
	public static void main(String args[])
	{
		System.out.println();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the side of the square(in cm) :");
		int s = sc.nextInt();
		System.out.println("Enter the length of the rectangle(in cm) :");
		int l = sc.nextInt();
		System.out.println("Enter the breadth of the rectangle(in cm) :");
		int b = sc.nextInt();


		System.out.println();
		//using constructor overloading
		System.out.println("Using Constructor overloading");
		calculate_area_constructor_overloading square = new calculate_area_constructor_overloading(s);
		calculate_area_constructor_overloading rectangle = new calculate_area_constructor_overloading(l,b);

		System.out.println();
		//using function overloading
		System.out.println("Using Function overloading");
		calculate_area_function_overloading A = new calculate_area_function_overloading();
		A.calculate_area(s);
		A.calculate_area(l,b);
	}
}
		