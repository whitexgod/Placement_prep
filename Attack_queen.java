//import java.util.*;
import java.io.*;
class function
{
    int diagonal_func(int temp1, int temp2)
    {
        int counter=0;
        while(temp1>0 && temp2>0)
        {
            ++counter;
            --temp1;
            --temp2;
        }
        return counter;
    }
}
public class Attack_queen
{
    public static void main(String args[]) throws IOException
    {
        //Scanner sc = new Scanner(System.in);
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(in.readLine());
        while (N>0)
        {
            String input[] = new String[3];
            input = in.readLine().split(" ");
            int n = Integer.parseInt(input[0]);
            int x = Integer.parseInt(input[1]);
            int y = Integer.parseInt(input[2]);
            function obj = new function();
            int a,b,c,d;
            a=n-x;
            b=n-(a+1);
            c=n-y;
            d=n-(c+1);
            int counter = obj.diagonal_func(a,c) + obj.diagonal_func(b,c) + obj.diagonal_func(a,d) + obj.diagonal_func(b,d);
            int total = counter + ((n-1)*2);
            System.out.println(total);
            --N;
        }
    }
}