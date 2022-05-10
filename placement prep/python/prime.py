import math
def prime(n):
    counter=1
    number=n
    for i in range(2,int(math.sqrt(n)+1)):
        if (number%i==0): counter=0
    if (counter==1):
        print ("prime number")
    else:
        print ("Not prime number")
        
n=int(input());
prime(n)