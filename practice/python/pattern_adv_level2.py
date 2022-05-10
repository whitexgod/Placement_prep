"""
4
1*2*3*4*17*18*19*20

  5*6*7*14*15*16

    8*9*12*13

      10*11
"""
n=int(input())
end_no=(n*n)+n
start_no=1
temp=n
carry=0
eleminate=temp-1
for i in range(n):
    for k in range(i):
        print("  ",end="")
    for j in range(i*2,n*2):
        if j<((i*2)+temp):
            print(str(start_no)+"*",end="")
            start_no=start_no+1
        else:
            if j==(n*2)-1:
                print(str(end_no-eleminate), end="")
                eleminate = eleminate - 1
            else:
                print(str(end_no-eleminate)+"*",end="")
                eleminate = eleminate - 1
    carry=carry+temp
    temp=temp-1
    eleminate=carry+temp-1
    print("\n")