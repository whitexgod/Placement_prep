L=int(input("Enter the range : "));
for i in range(L):
    print("* ",end="");
print()
for i in range(L):
    print("*")
for i in range(L):
    print("* ",end="")
print()
for i in range(L):
    for j in range(L):
        if(j==L-1):
            print("*",end="");
        else:
            print("  ",end="");
    print();
for i in range(L):
    print("* ",end="")
    