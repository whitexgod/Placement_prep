#include <stdio.h>
#define pie 3.14
float area(float r)
{
    return (pie*r*r);
}
void main()
{
    int radius;
    scanf("%d",&radius);
    printf("\nArea of the circle : %.2f",area(radius));
}