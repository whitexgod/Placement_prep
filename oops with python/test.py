S1 = input()
S2 = input()
L1=[]
L2=[]
for i in range(len(S1)):
    L1.append(S1[i])
for i in range(len(S2)):
    L2.append(S2[i])
L_new=[]
for each in L1:
    if each not in L2:
        L_new.append(each)
res="".join(L_new)
print(res)