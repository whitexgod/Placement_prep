d={}
n=int(input())
def find_name(d,s):
    if s in d:
        return inp+"="+str(d.get(inp))
    else:
        return "Not found"
for i in range(n):
    inp=input().split()
    key=inp[0]
    value=int(inp[1])
    d[key]=value
list=[]
while True:
    try:
        inp=input().strip()
        list.append(find_name(d,inp))
    except:
        break
for i in list:
    print(i)
