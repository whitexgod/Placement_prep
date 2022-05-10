from itertools import combinations

S=list(input().strip().split());
for i in range(1,int(S[1])+1):
    l=(list(combinations(sorted(S[0].upper()),i)))
    for each in l:
        for j in range(len(each)):
            print(each[j],end="")
        print()