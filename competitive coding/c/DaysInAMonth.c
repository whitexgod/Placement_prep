#include <stdio.h>
#include <string.h>

void main()
{
    int arr[] = {31,28,31,30,31,30,31,31,30,31,30,31};
    char date[11];
    char *token;
    printf("\nEnter date in dd-mm-yyyy format : \n");
    scanf("%s",date);
    token=strtok(date,"-");
    token=strtok(NULL,"-");
    int i = atoi(token);
    printf("The number of days = %d ",arr[i-1]);
}