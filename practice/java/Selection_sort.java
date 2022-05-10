import java.lang.*;
import java.util.*;

class swap
{
    int n1;
    int n2;
    void swap(int a, int b)
    {
        int temp = b;
        b=a;
        a=temp;
        n1=a;
        n2=b;
    }
}

class Selection_sort
{
    public static void main(String args[]) 
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the length of the array : ");
        int n = scan.nextInt();
        int arr[] = new int[n];
        System.out.println();
        System.out.println("Enter the array elements now : ");
        System.out.println();
        for(int i=0;i<n;i++)
        {
            System.out.println("Enter "+(i+1)+" Element : ");
            arr[i] = scan.nextInt();
        }
        swap obj = new swap();
        for(int i=0; i<n; i++)
        {
            int small=arr[i];
            int index=i;
            for(int j=i+1;j<n;j++)
            {
                if(arr[j]<small)
                {
                    small=arr[j];
                    index=j;
                }
            }
            obj.swap(arr[i],arr[index]);
            int temp=arr[index];
            arr[i]=obj.n1;
            arr[index]=obj.n2;
        }
        System.out.println("The sorted array is : ");
        for( int i=0;i<n;i++)
        {
            System.out.print(arr[i]+"\t");
        }
    }
}