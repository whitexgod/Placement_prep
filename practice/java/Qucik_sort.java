import java.lang.*;
import java.util.*;

class Qucik_sort
{
    int Partition(int arr[],int lb, int ub)
    {
        int pivot=arr[lb];
        int start=lb;
        int end=ub;
        while(start<end)
        {
            while(arr[start]<=pivot)
            {
                start++;
            }
            while(arr[end]>pivot)
            {
                end--;
            }
            if(start<end)
            {
                int temp=arr[start];
                arr[start]=arr[end];
                arr[end]=temp;
            }
        }
        int temp=arr[lb];
        arr[lb]=arr[end];
        arr[end]=temp;
        return end;
    }
    void quicksort(int arr[],int lb,int ub)
    {
        if(lb<ub)
        {
            int loc=Partition(arr,lb,ub);
            quicksort(arr,lb,loc-1);
            quicksort(arr,loc+1,ub);
        }
    }
    void display(int arr[],int n)
    {
        System.out.println("The sorted array is : ");
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+"\t");
        }
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the range of the array : ");
        int n=sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the array elements : ");
        
        for(int i=0;i<n;i++)
        {
            System.out.println("Enter "+(i+1)+" element : ");
            arr[i]=sc.nextInt();
        }

        Qucik_sort obj = new Qucik_sort();
        obj.quicksort(arr,0,(n-1));
        obj.display(arr,n);
    }
}
