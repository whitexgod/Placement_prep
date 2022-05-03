import java.util.*;
public class Palindrome_string {
    public static void main(String args[])    
    {
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String newA="";
        for(int i=0;i<A.length();++i)
        {
            newA=A.charAt(i)+newA;
        }
        if (newA.equals(A))
            System.out.print("Yes");
        else
            System.out.print("No");
    }
}
