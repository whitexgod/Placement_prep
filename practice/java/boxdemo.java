import java.lang.*;
import java.util.*;

class box
{
	double width;
	double height;
	double length;

	void value_declaration( double w, double h, double l)
	{
		width=w;
		height=h;
		length=l;
	}

	void cal_vol()
	{
		System.out.println("The volume of the box is : "+ width*height*length);
	}
}

class boxdemo
{
	public static void main(String args[])
	{

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the width of the Box : ");
		double a = sc.nextInt();
		System.out.println("Enter the height of the Box : ");
		double b = sc.nextInt();
		System.out.println("Enter the length of the Box : ");
		double c = sc.nextInt();
	
		box obj = new box();

		obj.value_declaration(a,b,c);
		obj.cal_vol();
	}
}
