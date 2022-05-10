import java.util.*;
public class test
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the range : ");
        int L = sc.nextInt();
        for(int i=0; i<L; i++)
        {
            System.out.print("* ");
        }
        System.out.println();
        for(int i=0; i<L; i++)
        {
            System.out.println("*");
        }
        for(int i=0; i<L; i++)
        {
            System.out.print("* ");
        }
        System.out.println();
        for(int i=0; i<L; i++)
        {
            for(int j=0; j<L; j++)
            {
                if(j==L-1)
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        for(int i=0; i<L; i++)
        {
            System.out.print("* ");
        }
    }
}