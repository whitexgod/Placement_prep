"""Sum of the given elements"""

import sys
sys.stdin = open("D:\Work\Coding\competitive coding\python\input.txt",'r')
sys.stdout = open("D:\Work\Coding\competitive coding\python\output.txt",'w')

arr = list(map(int,input().split()))
sum=0
for each in arr:
    sum+=each;
print(sum)