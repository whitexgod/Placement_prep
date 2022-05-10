//Example: 5!=1*2*3*4*5

#include <stdio.h>

int main()
{
    int n,result=1;
    scanf("%d",&n);
    if(n==0)
        printf("%d", 1);
    else
    {
        for(int i=1; i<n+1; ++i)
        {
            result=result*i;
        }
        printf("%d", result);
    }
}