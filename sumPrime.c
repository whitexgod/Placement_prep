#include <stdio.h>
#include <math.h>

int sum(int a, int b)
{
    return (a+b);
}
int prime(int n)
{
    int flag=1;
    for(int i=2; i<sqrt(n)+1; ++i)
    {
        if(n%i==0)
            flag=0;
    }
    return  flag;
}
int sumprime(int lb, int ub)
{
    int sum=1;
    for(int i=lb; i<ub+1; ++i)
    {
        if(prime(i)==1)
            sum += i;
    }
    return sum;
}
void main()
{
    int lb,ub;
    scanf("%d %d", &lb, &ub);
    printf("\nThe sum of all the prime numbers in the given range is : %d",sumprime(lb,ub));
}