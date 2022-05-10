from itertools import combinations_with_replacement

S=list(input().strip().split())
l=(list(combinations_with_replacement(sorted(S[0].upper()),int(S[1]))))
for each in l:
        for j in range(len(each)):
            print(each[j],end="")
        print()