a,b=map(int, input().strip().split())
def gcd(a,b):
    if (a==b):
        print ("GCD = ",a)
    elif (a>b):
        return gcd(a-b,b)
    elif (b>a):
        return gcd(a,b-a)
gcd(a,b)
