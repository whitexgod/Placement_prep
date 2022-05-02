#include <stdio.h>
#include <stdlib.h>
void linear_search(int arr[], int element, int l)
{
    int flag=0,i=0;
    while(i<l)
    {
        if(arr[i]==element)
        {
            printf("\n Element found at %d position\n",i+1);
            ++flag;
        }
        ++i;
    }
    if(flag==0)
        printf("\nElement not present in the array\n");
    else
        printf("\n The frequency of the searched element in the array is : %d",flag);
}
int main()
{
    int l,element,i;
    printf("Enter the length of the array : ");
    scanf("%d",&l);
    int arr[l];
    printf("\nEnter the array elements :\n");
    for(i=0; i<l; ++i)   
        scanf("%d",&arr[i]);
    printf("\nEnter the element to search : ");
    scanf("%d",&element);
    linear_search(arr,element,l);
    return 0;
}