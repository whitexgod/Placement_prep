import java.util.*;

class Functions
{
    public int Sum(int a, int b)
    {
        return (a+b);
    }
    public int prime(int n)
    {
        int flag=1;
        for (int i=2; i<Math.sqrt(n)+1; ++i)
        {
            if(n%i==0)
            flag=0;
        }
        return flag;
    }
    public int sumprime(int lb, int ub)
    {
        int sum=1;
        for(int i=lb; i<ub+1; ++i)
        {
            if(prime(i)==1)
                sum += i;
        }
        return sum;
    }
}
public class SumPrime {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int lb = sc.nextInt();
        int ub = sc.nextInt();
        Functions obj = new Functions();
        try
        {
            System.out.println("The sum of all the prime numbers in the given range is : "+obj.sumprime(lb, ub));
        }
        catch(Exception e)
        {
            System.out.println("Some unexpected error happended : "+e);
        }
    }
}
