n = int(input())
f = 1
if(n == 0):
    print(1)
elif(n > 0):
    for i in range(1, n+1):
        f = f*i
print(f)
