from itertools import*

N=int(input())
S=list(input().lower().strip().split())[:N]
K=int(input())

s=""
for i in range(1,N+1):
    s=s+str(i)
l1=list(combinations(s,K))

pos_l=[]
for i in range(len(S)):
    if(S[i]=='a'):
        pos_l.append(str(i+1))

new_l1=[]
flag=True
for each in l1:
    for i in range(len(each)):
        if (each[i] in pos_l ):
            flag=False
    if(flag):
        new_l1.append(each)
    flag=True
print("{0:.4f}".format((len(l1)-len(new_l1))/len(l1)))


"""from itertools import combinations

N = int(input())
L = input().split()
K = int(input())

C = list(combinations(L, K))
F = filter(lambda c: 'a' in c, C)
print("{0:.3}".format(len(list(F))/len(C)))"""