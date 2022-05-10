/**
 Beat the Average Problem Code: ABOVEAVG
Add problem to Todo list
Submit (Practice)
There are N students in a class. Recently, an exam on Advanced Algorithms was conducted with maximum score M and minimum score 0. The average score of the class was found out to be exactly X.

Given that a student having score strictly greater than the average receives an A grade, find the maximum number of students that can receive an A grade.

Input Format
First line will contain T, number of test cases. Then the test cases follow.
The only line of each test case consists of three integers N,M,X - the number of students, the maximum score and the average score respectively.
Output Format
For each test case, output in a single line, the maximum number of students who can receive A grade.

Constraints
1≤T≤1000
2≤N≤107
1≤X≤M≤100
Sample Input 1 
4
2 100 50
3 100 50
5 40 40
10 50 49
Sample Output 1 
1
2
0
9
 */

#include <stdio.h>
#include <math.h>

void beatTheAverage(int N, int M, int X)
{
    if(M==X)
        printf("\n%d",0);
    else
    {
        int temp1=N*X;
        int temp2=temp1/(X+1);
        printf("\n%d",temp2);
    }
}
void main()
{
    int n;
    scanf("%d",&n);
    while(n>0)
    {
        int N,M,X;
        scanf("%d %d %d", &N, &M, &X);
        beatTheAverage(N,M,X);
        --n;
    }
}