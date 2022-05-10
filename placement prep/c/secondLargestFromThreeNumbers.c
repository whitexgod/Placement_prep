#include <stdio.h>
void second_greatest(int a, int b, int c)
{
    if(a>b && a>c)
    {
        if(b>c)
            printf("%d",b);
        else
            printf("%d",c);
    }
    else if(b>a && b>c)
    {
        if(a>c)
            printf("%d",a);
        else
            printf("%d",c);
    }
    else
    {
        if(a>b)
            printf("%d",b);
        else
            printf("%d",b);
    }
}
void main()
{
    int a,b,c;
    scanf("%d %d %d", &a, &b, &c);
    printf("\n The Second greatest among the three numbers is : ");
    second_greatest(a,b,c);
}