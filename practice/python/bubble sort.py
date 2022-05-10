import sys

n = int(input().strip())
a = list(map(int, input().strip().split(' ')))
c=0
for i in range(n-1):
    t=1
    for j in range(n-t):
        if a[j+1]<a[j]:
            temp=a[j]
            a[j]=a[j+1]
            a[j+1]=temp
            c+=1
    t+=1
print ("Array is sorted in {} swaps.".format(c))
print ("First Element: {}".format(a[0]))
print ("Last Element: {}".format(a[-1]))