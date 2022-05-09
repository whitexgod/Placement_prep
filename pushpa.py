
N=int(input())
while(N>0):
    n=int(input())
    h=list(map(int,input().strip().split()))
    maximum=h.index(max(h))
    c=1
    for i in range (maximum,n):
        if i!=maximum:
            h[i] += c
            if h[i]==h[maximum]+1:
                c+=1
                maximum=i
    print(h[maximum])
    N-=1