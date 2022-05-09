/**
 Pushpa Problem Code: PUSH7PA
Add problem to Todo list
Submit
Pushpa has entered Chefland and wants to establish Pushpa-Raj here too.

Chefland has N towers where the height of the ith tower is Hi. To establish Pushpa-Raj, Pushpa does the following:

Initially, Pushpa chooses any tower i (1≤i≤N) and lands on the roof of that tower.
Let X denote the height of the tower Pushpa is currently on, then, Pushpa can land on the roof of any tower j (1≤j≤N) such that the height of the jth tower is (X+1).
Let i denote the index of the tower on which Pushpa lands, then, the height of all towers except tower i increases by 1 after each jump including the initial jump.

To establish Pushpa-Raj, Pushpa wants to land at the maximum height possible. Determine the maximum height Pushpa can reach.

Input Format
The first line contains a single integer T - the number of test cases. Then the test cases follow.
The first line of each test case contains an integer N - the number of towers
The second line of each test case contains N space-separated integers H1,H2,…,HN denoting the initial heights of each of the towers from the ground.
Output Format
For each test case, output in a single line the maximum height achieved by Pushpa.

Constraints
1≤T≤10
1≤N≤105
1≤Hi≤109
Sample Input 1 
2
4
1 2 1 3
1
2
Sample Output 1 
3
2
 */

#include <stdio.h>

/**
#include <stdio.h>
void main()
{
    int N;
    scanf("%d",&N);
    while(N--)
    {
        int n;
        scanf("%d",&n);
        int h[n]; 
        int max_index=0; 
        for (int i=0; i<n; ++i)
        {
            scanf("%d",&h[i]);
            if (h[i]>h[max_index])
                max_index=i;
        }            
        int flag=1;
        while (flag==1)
        {
            int maxx=max_index;
            for(int k=0;k<n;++k)
                if (k!=max_index)
                {
                    h[k] = h[k]+1;
                    if (h[k]==h[max_index]+1)
                        maxx=k;
                }
            if (maxx==max_index)                 
                flag=0;
            else
                max_index=maxx;
        }
        printf("\n%d",h[max_index]); 
    }
}
 
 */

#include <stdio.h>
void main()
{
    int N;
    scanf("%d",&N);
    while(N--)
    {
        int n;
        scanf("%d",&n);
        int h[n]; 
        int max_index=0; 
        for (int i=0; i<n; ++i)
        {
            scanf("%d",&h[i]);
            if (h[i]>h[max_index])
                max_index=i;
        }            
        int c=1;
        for (int k=0;k<n;++k)
        {
            if(k!=max_index)
            {
                h[k] += c;
                if (h[k]==h[max_index]+1)
                {
                    ++c;
                    max_index=k;
                }
            }
        }
        printf("\n%d",h[max_index]);       
    }
}

