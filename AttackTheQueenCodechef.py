"""
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
"""
def diagonal_func(t1,t2):
    count=0
    while(t1>0 and t2>0):
        count += 1
        t1 -= 1
        t2 -= 1
    return count
I=int(input())
while I>0:
    n,x,y = map(int, input().strip().split())
    a=n-x;
    c=n-y;
    counter = diagonal_func(a,c) + diagonal_func(n-(a+1),c) + diagonal_func(a,n-(c+1)) + diagonal_func(n-(a+1),n-(c+1));
    print(counter + ((n-1)*2))
    I -= 1
    
    
