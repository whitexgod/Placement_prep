import java.util.*;

public class Reverse_string {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String newA="";
        for(int i=0;i<A.length();++i)
        {
            newA=A.charAt(i)+newA;
        }
        System.out.println(newA);
    }
}

