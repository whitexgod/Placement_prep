#include <stdio.h>
void binary_search(int arr[], int element, int lb, int ub)
{
    int middle=(lb+ub)/2;
    if(arr[middle]==element)
    {
        printf("\nElement found at : %d position",middle+1);
    }
    else
    {
        if(arr[middle]>element)
            binary_search(arr, element, lb, middle-1);
        else
            binary_search(arr, element, middle+1, ub);
    }
}
int main()
{
    int l,element,i;
    printf("Enter the length of the array : ");
    scanf("%d",&l);
    int arr[l];
    printf("\nEnter the array elements (in an sorted manner mandatory) :\n");
    for(i=0; i<l; ++i)   
        scanf("%d",&arr[i]);
    printf("\nEnter the element to search : ");
    scanf("%d",&element);
    binary_search(arr,element,0,l);
    return 0;
}