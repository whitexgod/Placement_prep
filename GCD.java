import java.util.*;
class GCD_func
{
    int gcd(int a, int b)
    {
        if (a==b)
            return a;
        else if(a>b)
            return gcd(a-b,b);
        else if(b>a)
            return gcd(a,b-a);
        else
            return 0;
    }
}
class GCD
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        GCD_func obj = new GCD_func();
        System.out.println("The GCD = "+obj.gcd(a, b));
    }
}