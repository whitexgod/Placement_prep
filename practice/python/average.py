arr = list(map(int , input().strip().split()))
l=[]
for each in arr:
    if each not in l:
        l.append(each)

print ("Average = " sum(l)/len(l))