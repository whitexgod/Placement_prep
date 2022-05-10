import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class infinite_input {

    public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
       int count = 1;
       while(scan.hasNext())
       {
           System.out.println(count+" "+scan.nextLine());
           count++;
       }
    }
}