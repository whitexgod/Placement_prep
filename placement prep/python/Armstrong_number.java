import java.util.*;
import java.lang.Math;

class arm_func{

    int length(int n)
    {
        return ((int) (Math.log10(n) + 1));
    }

    int power (int a, int b)
    {
        int result=1;
        for(int i=0; i<b; ++i)
        {
            result=result*a;
        }
        return (result);
    }

    void arm_function (int n)
    {
        int result=0,num=n;
        int length = length(n);
        while(num>0)
        {
            int rem=num%10;
            result=result+power(rem, length);
            num/=10;
        }
        if(n==result)
            System.out.println("Armstrong number");
        else    
            System.out.println("Not an Armstrong number");
    }
}
public class Armstrong_number {
    public static void main(String args[])    
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        arm_func obj = new arm_func();
        obj.arm_function(n);
    }
}
