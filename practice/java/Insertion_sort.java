import java.lang.*;
import java.util.*;

class Insertion_sort
{
    void Insertion_sort_method(int arr[],int n)
    {
        for(int i=1; i<n; i++)
        {
           int s_arr_index=i-1;;
           int temp=arr[i];
           for(int j=i-1; j>=0; j--)
           {
                if(arr[j]>temp)
                {
                    arr[j+1]=arr[j];
                    s_arr_index=j;
                }
           }
           arr[s_arr_index]=temp;
        }
    }

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
        Insertion_sort obj = new Insertion_sort();
        obj.Insertion_sort_method(arr,n);

        System.out.println("The sorted array is : ");
        for( int i=0;i<n;i++)
        {
            System.out.print(arr[i]+"\t");
        }
    }
}