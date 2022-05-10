//using Eucliden algo

#include <stdio.h>
int GCD(int a, int b)
{   
    if(a==b)
        return a;
    else if(a>b)
        return GCD(a-b,b);
    else if(b>a)
        return GCD(a,b-a);
    else    
        return 0;
}
void main()
{
    int a,b;
    scanf("%d %d",&a,&b);
    if(GCD(a,b)==0)
        printf("\nSome unexpected error encountered.");
    else
        printf("\nThe GCD = %d",GCD(a,b));
}