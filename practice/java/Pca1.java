import java.lang.*;
import java.util.*;
import java.util.Arrays;

class fun_Tuhin
{	
	Scanner sc = new Scanner(System.in);

	void accept_city_Tuhin(String array_Tuhin[])
	{
		System.out.println("Enter city names one after another :");
		for(int i_Tuhin=0; i_Tuhin<array_Tuhin.length; i_Tuhin++)
		{
			array_Tuhin[i_Tuhin] = sc.nextLine();
		}
	}	
	void sort_Tuhin(String array_Tuhin[])
	{
		int size_Tuhin = array_Tuhin.length;
		for(int i_Tuhin=0; i_Tuhin<size_Tuhin-1; i_Tuhin++)   
		{	  
			for (int j_Tuhin = i_Tuhin+1; j_Tuhin<array_Tuhin.length; j_Tuhin++)   
			{  
				if(array_Tuhin[i_Tuhin].compareTo(array_Tuhin[j_Tuhin])>0)   
				{   
					String temp_Tuhin = array_Tuhin[i_Tuhin];  
					array_Tuhin[i_Tuhin] = array_Tuhin[j_Tuhin];  
					array_Tuhin[j_Tuhin] = temp_Tuhin;  
				}  
			}  
		}  	
	}
	void display_asscending_Tuhin(String array_Tuhin[])
	{	
		System.out.println("The array in asscending order is as follows : ");
		for(int i_Tuhin=0; i_Tuhin<array_Tuhin.length; i_Tuhin++)
		{
			System.out.println(array_Tuhin[i_Tuhin]);
		}
	}
	void display_descending_Tuhin(String array_Tuhin[])
	{	
		System.out.println("The array in descending order is as follows : ");
		for(int i_Tuhin=array_Tuhin.length-1; i_Tuhin>=0; i_Tuhin--)
		{
			System.out.println(array_Tuhin[i_Tuhin]);
		}
	}
}
class Pca1
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("How many City names do you want to enter?");
		int n_Tuhin = sc.nextInt();
		System.out.println();

		String array_Tuhin[] = new String[n_Tuhin];
		
		fun_Tuhin obj_Tuhin = new fun_Tuhin();
		
		obj_Tuhin.accept_city_Tuhin(array_Tuhin);
		System.out.println();
		obj_Tuhin.sort_Tuhin(array_Tuhin);
		System.out.println();
		
		System.out.println("Enter the order of the arrangement :");
		System.out.println("Enter 1 to arrange the array in asscending order.");
		System.out.println("Enter 2 to arrange the array in descending order.");
		int choice_Tuhin = sc.nextInt();
		System.out.println();
		System.out.println();

		switch(choice_Tuhin)
		{
			case 1:
			obj_Tuhin.display_asscending_Tuhin(array_Tuhin);
			break;
			case 2:
			obj_Tuhin.display_descending_Tuhin(array_Tuhin);
			break;
			default:
			System.out.println("Wrong choice");
		}		
	}
}
						