from unittest import result


n = int(input())
result=1;
if (n==0):
    print (result)
else:
    for i in range(1,n+1):
        result=result*i
    print (result)