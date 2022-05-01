def prime(n):
    counter=0
    number=n
    for i in range(1,n+1):
        if (number%i==0): counter=counter+1
    if (counter==2):
        print ("prime number")
    else:
        print ("Not prime number")
        
n=int(input());
prime(n)