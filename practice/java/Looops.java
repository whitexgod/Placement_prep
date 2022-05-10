import java.lang.*;
import java.util.*;

class Looops
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		String str;
		System.out.println("Enter your name : ");
		str = sc.nextLine();

		//using for loop

		/*for(int i=1;i<=5;i++)
		{
			System.out.println(str);
		}*/

		//using do while loop

		/*int i=1;
		do
		{
			System.out.println(str);
			i++;
		}
		while(i<5);*/

		//using while loop

		int i = 1;
		while(i<=5)
		{
			System.out.println(str);
			i++;
		}
	}
}