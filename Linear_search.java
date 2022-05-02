import java.util.*;
class linearSearchFunction
{
    void linearSearchFunction(int arr[], int element, int n)
    {
        int flag=0;
        for(int i=0;i<n; ++i)
        {
            if(arr[i]==element)
                ++flag;
        }
        if(flag==0)
            System.out.println("Element not found");
        else
            System.out.println("Element found! The frequency of element : "+flag);
    }
}
class Linear_search
{
    public static void main (String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[]= new int[n];
        for(int i=0;i<n;++i)
            arr[i]=sc.nextInt();
        int element = sc.nextInt();
        linearSearchFunction obj = new linearSearchFunction();
        obj.linearSearchFunction(arr, element, n);
    }
}