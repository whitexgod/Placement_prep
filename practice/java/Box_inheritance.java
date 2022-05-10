import java.lang.*;
import java.util.*;

class Box1
{
	double width;
	double height;
	double length;
    double volume;

	void set_val( double w, double h, double l)
	{
		width=w;
		height=h;
		length=l;
	}

	void cal_vol()
	{
        volume = width*height*length;
	}
}

class Box2 extends Box1
{
    double weight;

    void set_val( double w )
	{
		weight = w;
	}

    void display()
    {
        System.out.println("The lenght of the box is : "+length);
        System.out.println("The weidth of the box is : "+width);
        System.out.println("The height of the box is : "+height);
        System.out.println();
        System.out.println("The weight of the box is : "+weight);
        System.out.println("The volume of the box is : "+ volume );
    }
}


class Box_inheritance
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
        System.out.println("Enter the Weight of the Box : ");
		double w = sc.nextInt();
	
		Box2 obj = new Box2();

		obj.set_val(a,b,c);
		obj.cal_vol();
        obj.set_val(w);
        obj.display();
	}
}