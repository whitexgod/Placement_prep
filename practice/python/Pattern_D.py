L=int(input("Enter the range : "))
for i in range(L-1):
    print("* ",end="")
print()
for i in range(L):
    for j in range(L):
        if((j==0) or (j==L-1)):
            print("* ",end="")
        else:
            print("  ",end="")
    print()
for i in range(L-1):
    print("* ",end="")