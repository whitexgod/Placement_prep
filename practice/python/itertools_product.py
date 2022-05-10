from itertools import product

A=list(map(int, input().strip().split()));
B=list(map(int, input().strip().split()));

l=(list(product(A,B)))
for each in l:
    print(each," ",end="")