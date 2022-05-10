/**
 Sugarcane Juice Business Problem Code: SUGARCANE
Add problem to Todo list
Submit
While Alice was drinking sugarcane juice, she started wondering about the following facts:

The juicer sells each glass of sugarcane juice for 50 coins.
He spends 20% of his total income on buying sugarcane.
He spends 20% of his total income on buying salt and mint leaves.
He spends 30% of his total income on shop rent.
Alice wonders, what is the juicer's profit (in coins) when he sells N glasses of sugarcane juice?

Input Format
The first line of input will contain an integer T — the number of test cases. The description of T test cases follows.
The first and only line of each test case contains an integer N, as described in the problem statement.
Output Format
For each test case, output on a new line the juicer's profit when he sells N glasses of juice.

Constraints
1≤T≤1000
1≤N≤106
Sample Input 1 
4
2
4
5
10
Sample Output 1 
30
60
75
150
 */

#include <stdio.h>

void main()
{
    int n;
    scanf("%d",&n);
    while(n--)
    {
        int c;
        scanf("%d",&c);
        int TI=50*c;
        int exp=(TI*.2)+(TI*.2)+(TI*.3);
        printf("\n%d",(TI-exp));
    }
}