from itertools import permutations

S=list(input().split())
l=list(permutations(sorted(S[0].upper()),int(S[1])))
for each in l:
    print(''.join(each))