def arm(n):
    result=0
    num=n
    while(num>0):
        rem=num%10
        result += rem ** len(str(n))
        num //= 10
    if (n==result):
        print ("Armstrong number")
    else:
        print("Not an Armstrong number")
    
n=int(input())
arm(n)