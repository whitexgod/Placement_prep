import java.util.*;

class fact
{
    void fact (int n)
    {
        int result=1;
        if(n==0)
            System.out.println("1");
        else{
            for(int i=1;i<n+1;++i)
                result=result*i;
            System.out.println(result);
        }
    }
}
public class Factorial_using_resursion {
    public static void main(String args[])
    {
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        fact obj = new fact();
        obj.fact(n);
    }
}
