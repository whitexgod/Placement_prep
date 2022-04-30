import java.util.*;

public class Factorial
{
    public static void main(String args[])
    {
        int result=1;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n==0)
            System.out.println("1");
        else{
            for(int i=1;i<n+1;++i)
                result=result*i;
            System.out.println(result);
        }
    }
}