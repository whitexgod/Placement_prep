import sys

sys.stdin = open("D:\Work\Coding\competitive coding\python\input.txt",'r')
sys.stdout = open("D:\Work\Coding\competitive coding\python\output.txt",'w')

"""Hotel Bytelandia Problem Code: HOTEL
Add problem to Todo list
Submit
A holiday weekend is coming up, and Hotel Bytelandia needs to find out if it has enough rooms to accommodate all potential guests. A number of guests have made reservations. Each reservation consists of an arrival time, and a departure time. The hotel management has hired you to calculate the maximum number of guests that will be at the hotel simultaneously. Note that if one guest arrives at the same time another leaves, they are never considered to be at the hotel simultaneously (see the second example).

Input
Input will begin with an integer T, the number of test cases. Each test case begins with an integer N, the number of guests. Two lines follow, each with exactly N positive integers. The i-th integer of the first line is the arrival time of the i-th guest, and the i-th integer of the second line is the departure time of the i-th guest (which will be strictly greater than the arrival time).

Output
For each test case, print the maximum number of guests that are simultaneously at the hotel.

Constraints
T≤100
N≤100
All arrival/departure times will be between 1 and 1000, inclusive
Sample Input 1 
3
3
1 2 3
4 5 6

1 2 3 max=3

5
1 2 3 4 5
2 3 4 5 6

1 1 1 1 1 max=1

7
13 6 5 8 2 10 12
19 18 6 9 9 11 15

2 5 6 8 10 12 13
9 6 18 9 11 15 19

1 2 2 3 2 2 2 max=3

Sample Output 1 
3
1
3
"""
def solve():
    N=int(input())
    check_in = list(map(int, input().split()))
    check_out = list(map(int, input().split()))
    time = []
    for x in check_in:
        time.append((x,1))
    for x in check_out:
        time.append((x,0))
    time.sort()    
    ans, occupied = 0,0
    for x in time:
        if x[1] == 1:
            occupied += 1
        else:
            occupied -= 1
        ans = max(ans,occupied)
    print(ans)
T=int(input())
while(T):
    T-=1;
    solve()
    
    

