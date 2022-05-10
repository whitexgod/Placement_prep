/**
Ved started playing a new mobile game called Fighting Clans. An army of N enemies is approaching his base. The ith enemy has Hi health points. An enemy gets killed if his health points become 0.
Ved defends his base using a weapon named Inferno. He can set the Inferno to one of the following two modes:

Single-Target Mode: In one second, the Inferno can target exactly one living enemy and cause damage of at most X health points.
Multi-Target Mode: In one second, the Inferno can target all living enemies and cause damage of 1 health point to each of them.
Find the minimum time required to kill all the enemies.

Note: Ved is not allowed to change the mode of the weapon once it is set initially.

Input Format
The first line contains a single integer T - the number of test cases. Then the test cases follow.
The first line of each test case contains two integers N and X - the number of enemies and the damage caused by the single-target mode of Inferno in one second respectively.
The second line of each test case contains N space-separated integers H1,H2,…,HN where Hi denotes the initial health points of ith enemy.
Output Format
For each test case, output in a single line, the minimum time required to kill all the enemies.

Constraints
1≤T≤1000
1≤N≤200
1≤X≤100
1≤Ai≤100
Sample Input 1 
4
5 4
2 2 4 1 1
3 5
5 4 5
4 4
4 4 4 4
3 10
7 8 9
Sample Output 1 
4
3
4
3 
 */

#include <stdio.h>
int find_max(int arr[], int N)
{
    int max=0;
    for(int i=0;i<N;++i)
    {
        if(arr[i]>arr[max])
            max=i;
    }
    return max;
}
int single_mode(int arr[], int N, int X)
{
    int count=0;
    for (int i=0;i<N;++i)
    {
        while(arr[i]>0)
        {
            arr[i]=arr[i]-X;
            ++count;
        }
    }
    return count;
}
void Inferno(int N, int X, int arr[])
{
    int maxSecondInMultiMode = arr[find_max(arr, N)];
    int single = single_mode(arr, N, X);
    if(single>maxSecondInMultiMode)
        printf("\n%d",maxSecondInMultiMode);
    else
        printf("\n%d",single);
}
void main()
{
    int n;
    scanf("%d",&n);
    while(n>0)
    {
        int N,X;
        scanf("%d %d", &N, &X);
        int arr[N];
        for (int i=0; i<N; ++i)
            scanf("%d", &arr[i]);
        Inferno(N,X,arr);
        --n;
    }
}