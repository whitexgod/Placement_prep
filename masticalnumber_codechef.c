/**
 Mystical Numbers Problem Code: XORGAND
Add problem to Todo list
Submit
A number M is said to be a Mystical Number with respect to a number X if (M⊕X)>(M&X).

You are given an array A of size N. You are also given Q queries. Each query consists of three integers L, R, and X.

For each query, find the count of Mystical Numbers in the subarray A[L:R] with respect to the number X.

Notes:

⊕ represents the Bitwise XOR operation and & represents the Bitwise AND operation.
A[L:R] denotes the subarray A[L],A[L+1],…,A[R].
Input Format
The first line contains a single integer T - the number of test cases. Then the test cases follow.
The first line of each test case contains an integer N - the size of the array A.
The second line of each test case contains N space-separated integers A1,A2,…,AN denoting the array A.
The third line of each test case contains an integer Q - denoting the number of queries.
The ith of the next Q lines contains three space-separated integers L , R and X.
Output Format
For each testcase,

For each query, print in a new line, the count of Mystical Numbers among A[L],A[L+1],…,A[R] with respect to the number X.
Constraints
1≤T≤100
1≤N≤2⋅105
0≤Ai<231
1≤Q≤2⋅105
1≤L≤R≤N
0≤X<231
Sum of N over all test cases does not exceed 2⋅105.
Sum of Q over all test cases does not exceed 2⋅105.
Sample Input 1 
1
5
1 2 3 4 5
2
1 5 4
2 5 2
Sample Output 1 
3
2
 */


#include <stdio.h>
int mastical(int m, int x)
{
    if((m^x)>(m&x))
        return 1;
    else
        return 0;
}
void main()
{
    int N;
    scanf("%d",&N);
    while(N--)
    {
        int n;
        scanf("%d",&n);
        int arr[n];
        for (int i=1; i<n+1; ++i)
            scanf("%d",&arr[i]);
        int Q;
        scanf("%d",&Q);
        while(Q--)
        {
            int counter=0;
            int l,r,x;
            scanf("%d %d %d",&l,&r,&x);
            for (int j=l; j<r+1; ++j)
            {
                if (arr[j] != x )
                    if ((arr[j]^x)>(arr[j]&x))
                        ++counter;
            }
            printf("\n%d",counter);
        }
    }
}