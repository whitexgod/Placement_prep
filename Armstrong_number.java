import java.util.*;
import java.lang.Math;

class arm_func{

    double length(double n)
    {
        return ((int) (Math.log10(n) + 1));
    }

    void arm_function(double n, double length)
    {
        double result=0.0,num=n;
        while(num>0)
        {
            Double rem=num%10;
            result=result+Math.pow(rem, length);
            num=num/10;
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
        double n = sc.nextDouble();
        arm_func obj = new arm_func();
        double len = obj.length(n);
        obj.arm_function(n, len);
    }
}
