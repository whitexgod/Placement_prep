"""
 String protocol Problem Code: STRP
Add problem to Todo list
Submit
An input string S of length N is transferred through the network using a special protocol. The protocol can send the string through a series of operations. In one operation, we can choose a lowercase english alphabet C and do one of the following:

Transfer 1 copy of C through the network.
Transfer 2 copies of C through the network.
Each of the above transfers take 1 unit of time.

Find the minimum time in which we can transfer the entire string S through the network.

Input Format
The first line will contain T - the number of test cases. Then the test cases follow.
First line of each test case contains N - the length of the string S.
Second line of each test case contains the string S.
Output Format
For each test case, output in a single line, the minimum time required to transfer the string.

Constraints
1≤T≤100
1≤N≤105
Sum of N over all test cases does not exceed 105.
String S contains lowercase english alphabets only.
Sample Input 1 
2
5
cbcdc
6
aabeee
Sample Output 1 
5
4
"""
T=int(input())
while(T):
    T-=1
    N = int(input())
    str = input()
    time=0
    j=0
    while(j<N):
        if(j!=N-1):
            if str[j]==str[j+1]:
                time+=1
                j+=2
            else:
                time+=1
                j+=1
        if(j==N-1):
            time+=1
            j+=1
    print(time)