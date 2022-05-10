#include <stdio.h>
#include <math.h>

int prime(int n)
{
    int counter=1;
    for(int i=2; i<sqrt(n)+1; ++i)
    {
        if(n%i==0)
            counter=0;
    }
    return counter;
}
void main()
{
    int n;
    scanf("%d", &n);
    if (prime(n)==1)
        printf("Prime number");
    else    
        printf("Not a Prime number");
}