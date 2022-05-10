import java.util.*;

class binarySearchFunction
{
    int binarySearchFunction(int arr[], int element, int lb, int ub)
    {
        try{
            int middle = (lb+ub)/2;
            if(arr[middle]==element)
            {
                System.out.println("Element found at :"+(middle+1)+" position");
                return 0;
            }             
            else{
                if(arr[middle]>element)
                    return binarySearchFunction(arr, element, lb, middle-1);
                else
                    return binarySearchFunction(arr, element, middle+1, ub);
            }
        }
        catch(Exception e){
            System.out.println("Element not found!");
            return 0;
        }
    }
}
public class Binary_search {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[]= new int[n];
        for(int i=0;i<n;++i)
            arr[i]=sc.nextInt();
        int element = sc.nextInt();
        binarySearchFunction obj = new binarySearchFunction();
        obj.binarySearchFunction(arr, element, 0, n);
    }
}
