#include <stdlib.h>
#include <stdio.h>
void binary(int n)
{
    int arr[n],i=0;
    while(n>0)
    {
        arr[i]=n%2;
        ++i;
        n=n/2;
    }
    for(int j=i;j>-1;j--)
    {
        printf("%d", arr[j]);
    }
};
int main()
{
    int n;
    scanf("%d",&n);
    binary(n);
}
