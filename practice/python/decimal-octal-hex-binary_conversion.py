def print_formatted(number):
    space=len(bin(n)[2:])
    for i in range(1, n+1):
        str1=str(i)
        str2=str(oct(i)[2:])
        str3=str(hex(i)[2:]).upper()
        str4=str(bin(i)[2:])
        print(str1.rjust(space),str2.rjust(space),str3.rjust(space),str4.rjust(space))

if __name__ == '__main__':
    n = int(input())
    print_formatted(n)