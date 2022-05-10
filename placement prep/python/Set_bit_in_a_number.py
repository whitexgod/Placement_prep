n = int(input())
counter = 0
while(n):
    counter = counter + ( n & 1 )
    n = n >> 1
print(counter)