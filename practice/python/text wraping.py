def wrap(string, max_width):
    j=max_width
    list=[]
    for i in range(0,len(string),j):
        list.append(string[i:i+j])
    for i in list:
        print(i)
    return ""

if __name__ == '__main__':
    string, max_width = input(), int(input())
    result = wrap(string, max_width)
    print(result)