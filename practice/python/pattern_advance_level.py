"""
input - 4

1*2*3*4*20*19*18*17

 5*6*7*16*15*14

  8*9*13*12

   10*11

"""

n=int(input())
end_no=(n*n)+n
start_no=1
temp=n
for i in range(n):
    for k in range(i):
        print(" ",end="")
    for j in range(i*2,n*2):
        if j<((i*2)+temp):
            print(str(start_no)+"*",end="")
            start_no=start_no+1
        else:
            if j==(n*2)-1:
                print(str(end_no), end="")
                end_no = end_no - 1
            else:
                print(str(end_no)+"*",end="")
                end_no=end_no-1
    temp=temp-1
    print("\n")