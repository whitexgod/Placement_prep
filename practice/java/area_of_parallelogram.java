import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class area_of_parallelogram {
    static int B;
    static int H;
    static boolean flag;
    static
    {
        Scanner sc = new Scanner(System.in);
        B=sc.nextInt();
        H=sc.nextInt();
        if ((B>=0) && (H>=0))
            flag = true;
        else
            System.out.print("java.lang.Exception: Breadth and height must be positive");
    }
    
public static void main(String[] args){
        System.out.println("B="+B);
        System.out.println("H="+H);
		if(flag){
			int area=B*H;
			System.out.print(area);
		}
		
	}//end of main

}//end of class

