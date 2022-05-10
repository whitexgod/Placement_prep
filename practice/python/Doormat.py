"""    Size: 7 x 21 
    ---------.|.---------
    ------.|..|..|.------
    ---.|..|..|..|..|.---
    -------WELCOME-------
    ---.|..|..|..|..|.---
    ------.|..|..|.------
    ---------.|.---------
    
    Size: 11 x 33
    ---------------.|.---------------3  1
    ------------.|..|..|.------------9  3
    ---------.|..|..|..|..|.---------15 5
    ------.|..|..|..|..|..|..|.------21 7
    ---.|..|..|..|..|..|..|..|..|.---27 9
    -------------WELCOME-------------
    ---.|..|..|..|..|..|..|..|..|.---27 9
    ------.|..|..|..|..|..|..|.------21 7
    ---------.|..|..|..|..|.---------
    ------------.|..|..|.------------
    ---------------.|.---------------"""

import math

N,M = map(int, input().split())
horizon=int(math.ceil(N/2))
s=".|."
temp = 1
for i in range(1, N+1):
    if(i<horizon):
        pre=post=int((M-3*temp)/2)
        for _ in range(pre):
            print("-",end="")
        for i in range(temp):
            print(s,end="")
        for _ in range(post):
            print("-",end="")
        temp=temp+2
        print()
    elif(i==horizon):
        pre=post=int((M-7)/2)
        for _i in range(pre):
            print("-",end="")
        print("WELCOME",end="")
        for _ in range(post):
            print("-",end="")
        temp=temp-2
        print()
    elif(i>horizon):
        pre=post=int((M-3*temp)/2)
        for _ in range(pre):
            print("-",end="")
        for i in range(temp):
            print(s,end="")
        for _ in range(post):
            print("-",end="")
        temp=temp-2
        print()
        
    
