import java.util.Scanner;
public class Set_bit_in_a_number {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int counter=0;
        while(n>0)
        {
            counter = counter + (n & 1);
            n = n >> 1;
        }
        System.out.println(counter);
    }
}
