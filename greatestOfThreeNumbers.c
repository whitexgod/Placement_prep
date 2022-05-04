#include <stdio.h>
void greatest(int a, int b, int c)
{
    (a>b)? ((a>c)? printf("%d",a) : printf("%d",c)) : ((b>c)? printf("%d",b) : printf("%d",c));
}
void main()
{
    int a,b,c;
    scanf("%d %d %d", &a, &b, &c);
    printf("\n The greatest among the three numbers is : ");
    greatest(a,b,c);
}