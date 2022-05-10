import java.lang.*;
import java.util.*;

class Heap_sort
{
    void Max_heapify(int arr[],int n,int i)
    {
        int largest = i;
        int left_child = 2*i;
        int right_child = (2*i)+1;
        while(left_child<=n && arr[largest]<arr[left_child])
        {
            largest = left_child;
        }
        while(right_child<=n && arr[largest]<arr[right_child])
        {
            largest = right_child;
        }
        if(largest != i)
        {
            int temp = arr[i];
            arr[i]=arr[largest];
            arr[largest]=temp;
            Max_heapify(arr,n,largest);
        }
    }

    void Build_heap(int arr[],int n)
    {
        for(int i=(n/2);i>=1;i--)
        {
            Max_heapify(arr,n,i);
        }
        for(int i=n; i>=1;i--)
        {
            int temp = arr[1];
            arr[1]=arr[i];
            arr[i]=temp;
            Max_heapify(arr,n,1);
        }
    }

    public static void main(String args[]) 
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the length of the array : ");
        int n = scan.nextInt();
        int arr[] = new int[n+1];
        System.out.println();
        System.out.println("Enter the array elements now : ");
        System.out.println();
        for(int i=1;i<=n;i++)
        {
            System.out.println("Enter "+(i)+" Element : ");
            arr[i] = scan.nextInt();
        }
        
        Heap_sort obj = new Heap_sort();
        obj.Build_heap(arr,n);

        System.out.println("The sorted array is : ");
        for( int i=1;i<=n;i++)
        {
            System.out.print(arr[i]+"\t");
        }
    }
}