"""
Coronavirus Spread Problem Code: COVID19
Add problem to Todo list
Submit
Read problem statements in Hindi, Bengali, Mandarin Chinese, Russian, and Vietnamese as well.
There are N people on a street (numbered 1 through N). For simplicity, we'll view them as points on a line. For each valid i, the position of the i-th person is Xi.

It turns out that exactly one of these people is infected with the virus COVID-19, but we do not know which one. The virus will spread from an infected person to a non-infected person whenever the distance between them is at most 2. If we wait long enough, a specific set of people (depending on the person that was infected initially) will become infected; let's call the size of this set the final number of infected people.

Your task is to find the smallest and largest value of the final number of infected people, i.e. this number in the best and in the worst possible scenario.

Input
The first line of the input contains a single integer T denoting the number of test cases. The description of T test cases follows.
The first line of each test case contains a single integer N.
The second line contains N space-seperated integers X1,X2,…,XN.
Output
For each test case, print a single line containing two space-separated integers ― the minimum and maximum possible final number of infected people.

Constraints
1≤T≤2,000
2≤N≤8
0≤Xi≤10 for each valid i
X1<X2<…<XN
Subtasks
Subtask #1 (10 points): N≤3
Subtask #2 (90 points): original constraints

Sample Input 1 
3
2
3 6
3
1 3 5
5
1 2 5 6 7
Sample Output 1 
1 1
3 3
2 3
"""

T=int(input())
while(T):
    T-=1;
    N=int(input())
    arr = list(map(int, input().split()))
    arr.append(0)
    counter=1
    max=min=temp=0
    for i in range (N):
        if arr[i+1]==arr[i]+1:
            counter+=1
        elif arr[i+1]==arr[i]+2:
            counter+=1
        else:
            temp=counter
            counter=1
            if(min==max==0):
                min=max=temp;
            if temp>max:
                max=temp;
            if temp<min:
                min=temp;
    print(min,max)