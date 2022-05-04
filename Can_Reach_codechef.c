/**
 A first-year student, came to your college. Being a good senior, you must tell him if it is possible to go from College Main Gate to Hostel for him.

The college can be visualized on a 2D-plane. Suppose the College Main Gate is situated at origin i.e. at the coordinates (0,0) and the Hostel is situated at the coordinates (x,y).

As the first-year student wants to explore the college campus further, in one move, he will increase or decrease any coordinate (either the x-coordinate or the y-coordinate) by a value of exactly K.

Is it possible for the first-year student to reach the Hostel?

Input Format
First line of input contains a single integer T, denoting the number of test cases. Then the description of the T test case follows.
Each test case contains one line of input.
The first line contains three integers x, y, K.

Output Format
For each test case, output a single line answer containing a "YES" or "NO" (without quotes).

You may print each character of each string in uppercase or lowercase (for example, the strings without quotes "yEs", "yes", "Yes" and "YES" will all be treated as identical).
 */

// Sample Input 1 
/**
4
1 2 1
3 -5 2
-9 -6 3
-18 12 5
*/
// Sample Output 1 
// YES
// NO
// YES
// NO

#include <stdio.h>
void can_reach(int x, int y, int k)
{
    if(x%k==0 && y%k==0)
        printf("\nYES");
    else
        printf("\nNO");
}
int main()
{
    int n,x,y,K;
    scanf("%d",&n);
    for(int i=0; i<n; ++i)
    {
        scanf("%d %d %d", &x, &y, &K);
        can_reach(x,y,K);
    }
    return 0;
}