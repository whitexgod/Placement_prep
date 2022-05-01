#include <stdio.h>
int prime(int n)
{
    int counter=0;
    for(int i=1;i<(n+1);++i)
    {
        if(n%i==0)
            ++counter;
    }
    if (counter==2)
        return 1;
    else 
        return 0;
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