#include <stdint.h>

int main()
{
    int n,counter=0;
    scanf("%d",&n);
    while(n>0)
    {
        counter = counter + (n & 1);
        n=n >> 1;
    }
    printf("%d",counter);
}