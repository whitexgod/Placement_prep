/**
Maximum OR Minimum Problem Code: MAXORMIN
Add problem to Todo list
Submit (Practice)
Alice and Bob are ready to play a new game. Both the players take alternate turns. Alice starts first.

There are N binary numbers written on a blackboard.

Alice, in her turn, erases any 2 numbers from the blackboard and writes the bitwise OR of those 2 numbers on the blackboard.
Bob, in his turn, erases any 2 numbers from the blackboard and writes the bitwise AND of those 2 numbers on the blackboard.
Note that, after each move, the count of numbers written on the blackboard reduces by 1.

Both players play until a single number remains on the blackboard. Alice wants to maximise the remaining number while Bob wants to minimise the remaining number. Find the remaining number if both the players play optimally.

Input Format
First line will contain T, number of test cases. Then the test cases follow.
First line of each test case contains of a single integer N - the count of numbers written on the blackboard initially.
Second line of each test case contains N space-separated integers A1,A2,…AN - the numbers written on the blackboard.
Output Format
For each test case, output in a single line, the remaining number, if both the players play optimally.

Constraints
1≤T≤1000
2≤N≤105
0≤Ai≤1
Sum of N over all test cases does not exceed 2⋅105.
Sample Input 1 
3
5
1 1 1 1 0
3
0 1 0
4
0 0 0 0
Sample Output 1 
1
0
0
 */

#include <stdio.h>
void max_min(int one, int zero, int turn)
{   
    if (zero==0)
        printf("\n%d",1);
    else if(one==0)
        printf("\n%d",0);
    else 
    {
        if (turn==1)
        {
            if(one==zero)
                printf("\n%d",1);
            else
            {
                turn=0;
                return max_min(one,zero-1,turn);
            } 
        }
        if (turn==0)
        {
            if(one==zero)
                printf("\n%d",0);
            else
            {
                turn=1;
                return max_min(one-1,zero,turn);
            }
        }        
    }
}
void main()
{
    int n;
    scanf("%d",&n);
    while(n>0)
    {
        int T,turn=1;
        int one=0,zero=0;
        scanf("%d",&T);
        for( int i=0; i<T; ++i)
        {
            int temp;
            scanf("%d",&temp);
            if(temp==1)
                ++one;
            else
                ++zero;
        }
        max_min(one,zero,turn);
        --n;
    }
}