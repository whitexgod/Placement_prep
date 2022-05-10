import java.lang.*;
import java.util.*;

class Bubble_sort
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
        for(int i=0; i<n; i++)
        {
            int start = 0;
            for(int k=i;k<n-1;k++)
            {
                if(arr[start+1]<arr[start])
                {
                    int temp=arr[start];
                    arr[start]=arr[start+1];
                    arr[start+1]=temp;
                }
                start++;
            }
        }
        System.out.println("The sorted array is : ");
        for( int i=0;i<n;i++)
        {
            System.out.print(arr[i]+"\t");
        }
    }
}