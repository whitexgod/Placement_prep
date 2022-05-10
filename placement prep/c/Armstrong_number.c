#include <stdio.h>
#include <math.h>

int length(int n)
{
    int counter=0;
    while(n>0)
    {
        ++counter;
        n/=10;
    }
    return counter;
}

int armstrong(int n, int length)
{
    int num=n;
    int result=0;
    while(n>0)
    {
        int remainder=n%10;
        result=result+pow(remainder, length);
        n/=10;
    }
    if(num==result)
        printf("Armstrong number");
    else
        printf("Not an Armstrong number");
    return 0;
}

void main()
{
    int n;
    scanf("%d",&n);  
    int len = length(n);
    armstrong(n,len);
}