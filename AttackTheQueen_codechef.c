/**
 The Attack of Queen Problem Code: QUEENATTACK
Add problem to Todo list
Submit
Chef has started developing interest in playing chess, and was learning how the Queen moves.

Chef has an empty N×N chessboard. He places a Queen at (X,Y) and wonders - What are the number of cells that are under attack by the Queen?

Notes:

The top-left cell is (1,1), the top-right cell is (1,N), the bottom-left cell is (N,1) and the bottom-right cell is (N,N).
The Queen can be moved any number of unoccupied cells in a straight line vertically, horizontally, or diagonally.
The cell on which the Queen is present, is not said to be under attack by the Queen.
Input Format
The first line contains a single integer T - the number of test cases. Then the test cases follow.
The first and only line of each test case contains three integers N, X and Y, as described in the problem statement.
Output Format
For each test case, output in a single line, the total number of cells that are under attack by the Queen.

Constraints
1≤T≤104
1≤N≤106
1≤X,Y≤N
Sample Input 1 
5
1 1 1
3 2 2
3 2 1
2 2 2
150 62 41
Sample Output 1 
0
8
6
3
527
 */


#include <stdio.h>
/**int check_d1(int x, int y, int count)
{
    if(x>0 && y>0)
    {
        ++count;
        return check_d1(x-1,y-1,count);
    }
    return count;
}
int check_d2(int n, int x, int y, int count)
{
    if(x>0 && y<n+1)
    {
        ++count;
        return check_d2(n,x-1,y+1,count);
    }
    return count;
}
int check_d3(int n, int x, int y, int count)
{
    if(x<n+1 && y>0)
    {
        ++count;
        return check_d3(n,x+1,y-1,count);
    }
    return count;
}
int check_d4(int n, int x, int y, int count)
{
    if(x<n+1 && y<n+1)
    {
        ++count;
        return check_d4(n,x+1,y+1,count);
    }
    return count;
}*/
int diagonal_func(int temp1, int temp2)
{
    int counter=0;
    while(temp1>0 && temp2>0)
    {
        ++counter;
        --temp1;
        --temp2;
    }
    return counter;
}
void main()
{
    int n;
    scanf("%d",&n);
    while(n--)
    {
        int n, x, y;
        scanf("%d %d %d",&n,&x,&y);
        /**int count=0;
        int d1 = check_d1(x-1,y-1,count) ;
        int d2 = check_d2(n,x-1,y+1,count);
        int d3 = check_d3(n,x+1,y-1,count);
        int d4 = check_d4(n,x+1,y+1,count);
        int total=d1+d2+d3+d4+((--n)*2);*/
        int a,b,c,d;
        a=n-x;
        b=n-(a+1);
        c=n-y;
        d=n-(c+1);
        int counter = diagonal_func(a,c) + diagonal_func(b,c) + diagonal_func(a,d) + diagonal_func(b,d);
        int total = counter + ((--n)*2);
        printf("\n%d",total);
    }
}

/**
#include <stdio.h>
int diagonal_func(int temp1, int temp2)
{
    int counter=0;
    while(temp1-- && temp2--)
    {
        ++counter;
    }
    return counter;
}
void main()
{
    int n;
    scanf("%d",&n);
    while(n--)
    {
        int n, x, y;
        scanf("%d %d %d",&n,&x,&y);
        int a,c;
        a=n-x;
        c=n-y;
        int counter = diagonal_func(a,c) + diagonal_func(n-(a+1),c) + diagonal_func(a,n-(c+1)) + diagonal_func(n-(a+1),n-(c+1));
        int total = counter + ((--n)*2);
        printf("\n%d",total);
    }
}
*/