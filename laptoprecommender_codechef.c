/**
Chef wants to buy a new laptop. However, he is confused about which laptop to buy out of 10 different laptops. He asks his N friends for their recommendation. The ith friend recommends the Chef to buy the Aithlaptop (1≤Ai≤10).

Chef will buy the laptop which is recommended by maximum number of friends. Determine which laptop Chef buys.
Print CONFUSED if there are multiple laptops having maximum number of recommendations.

Input Format
The first line contains a single integer T - the number of test cases. Then the test cases follow.
The first line of each test case contains an integer N - the number of Chef's friends.
The second line of each test case contains N space-separated integers A1,A2,…,AN where Ai denotes the recommendation of the ith friend.
Output Format
For each test case, output in a single line, the laptop which has the maximum number of recommendations. Print CONFUSED if there are multiple laptops having maximum number of recommendations.

You may print each character of CONFUSED in uppercase or lowercase (for example, Confused, coNFused, CONFused will be considered identical).

Constraints
1≤T≤200
1≤N≤1000
1≤Ai≤10
Sample Input 1 
4
5
4 4 4 2 1
7
1 2 3 4 5 6 6
6
2 2 3 3 10 8
4
7 7 8 8
Sample Output 1 
4
6
CONFUSED
CONFUSED 
 */

#include <stdio.h>

void main()
{
    int n;
    scanf("%d",&n);
    for (int i=0;i<n;++i)
    {
        int T,count,max;
        scanf("%d",&T);
        int arr[T],frequency[T];
        for(int j=0;j<T;++j)
        {
            scanf("%d",&arr[j]);
            frequency[j]=-1;
        }
        for( int j=0;j<T;++j)
        {
            count=1;
            for (int k=j+1;k<T;++k)
            {
                if(arr[j]==arr[k])
                {
                    ++count;
                    frequency[k]=0;
                }
            }
            if(frequency[j] != 0)
                frequency[j]=count;
        }
        max=0;
        count=0;
        for (int j=0;j<T;++j)
        {
            if(frequency[j] != 0)
            {
                if(frequency[max]<frequency[j])
                    max=j;
            }
        }       
        for (int j=0;j<T;++j)
        {
            if(frequency[j] != 0)
            {
                if(frequency[j]==frequency[max])
                ++count;
            }
        }        
        if(count==1)
            printf("\n%d",arr[max]);
        else
            printf("\nCONFUSED");
    }
}