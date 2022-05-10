"""#size 3

----c----   w=1 d=8 8
--c-b-c--   w=3 d=6 4
c-b-a-b-c   w=5 d=4
--c-b-c--   w=3 d=6 4
----c----   w=1 d=8 8

#size 5

--------e--------   16   
------e-d-e------   12
----e-d-c-d-e----   6
--e-d-c-b-c-d-e--
e-d-c-b-a-b-c-d-e
--e-d-c-b-c-d-e--
----e-d-c-d-e----
------e-d-e------
--------e--------
"""

n=int(input())
alphabet=[]
alpha = 'a'
for i in range(n):
    alphabet.append(alpha)
    alpha=chr(ord(alpha)+1)
max_letters_range=(n*2)-1
max_dash_range=max_letters_range-1
temp1=len(alphabet)-1
temp2=len(alphabet)-1
w=1
temporary=1
d=0
for i in range(1,max_letters_range+1):
    if(i<n-1):
        d=(max_letters_range+max_dash_range+1)-temporary
        for j in range (1, max_letters_range+max_dash_range+1):
            if(j<=d/2):
                print("-",end="")
            elif(j>d/2+temporary):
                print("-",end="")
            elif((j>d/2) and (j<d/2+temporary)):
                if(j%2==0):
                    print("-",end="")
                else:
                    if(j<max_letters_range):
                        print(alphabet[temp2],end="")
                        temp2 -= 1
                    if(j==max_letters_range):
                        print(alphabet[temp2],end="")
                        temp2 += 1
                    if(j>max_letters_range):
                        print(alphabet[temp2],end="")
                        temp2 += 1                            
        w=w+2
        temporary=w*2-1
        temp2=len(alphabet)-1
        print()   
    if(i==n-1):
        d=(max_letters_range+max_dash_range+1)-temporary
        for j in range (1, max_letters_range+max_dash_range+1):
            if(j<=d/2):
                print("-",end="")
            elif(j>d/2+temporary):
                print("-",end="")
            elif((j>d/2) and (j<d/2+temporary)):
                if(j%2==0):
                    print("-",end="")
                else:
                    if(j<max_letters_range):
                        print(alphabet[temp2],end="")
                        temp2 -= 1
                    if(j==max_letters_range):
                        print(alphabet[temp2],end="")
                        temp2 += 1
                    if(j>max_letters_range):
                        print(alphabet[temp2],end="")
                        temp2 += 1                            
        temp2=len(alphabet)-1
        print()   
    if(i==n):
        for j in range (1, max_letters_range+max_dash_range+1):
            if(j%2==0):
                print("-",end="")
            else:
                if(j<max_letters_range):
                    print(alphabet[temp1],end="")
                    temp1 -= 1
                if(j==max_letters_range):
                    print(alphabet[temp1],end="")
                    temp1 += 1
                if(j>max_letters_range):
                    print(alphabet[temp1],end="")
                    temp1 += 1
        print()
    if(i>n):
        d=(max_letters_range+max_dash_range+1)-temporary
        for j in range (1, max_letters_range+max_dash_range+1):
            if(j<=d/2):
                print("-",end="")
            elif(j>d/2+temporary):
                print("-",end="")
            elif((j>d/2) and (j<d/2+temporary)):
                if(j%2==0):
                    print("-",end="")
                else:
                    if(j<max_letters_range):
                        print(alphabet[temp2],end="")
                        temp2 -= 1
                    if(j==max_letters_range):
                        print(alphabet[temp2],end="")
                        temp2 += 1
                    if(j>max_letters_range):
                        print(alphabet[temp2],end="")
                        temp2 += 1                            
        w=w-2
        temporary=w*2-1
        temp2=len(alphabet)-1
        print()    
            
            
                
        