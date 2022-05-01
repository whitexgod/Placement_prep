import java.util.*;
class prime_func{
    int prime (int n)
    {
        int c=0;
        for(int i=1; i<n+1; ++i)
        {
            if(n%i==0)
                ++c;
        }
        if (c==2)
            System.out.println("Prime Number");
        else    
            System.out.println("Not a Prime");
        return 0;
    }
}
class prime
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        prime_func obj = new prime_func();
        obj.prime(n);
    }
}