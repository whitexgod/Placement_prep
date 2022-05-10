if __name__ == '__main__':
    n = int(input())
    arr = input().split()
    list=[]
    for i in range(n):
        list.append(int(arr[i]))
    max_term=(max(list))
    new=[]
    for i in range(n):
        if(list[i] != max_term):
            new.append(list[i])
        else:
            pass
    print(max(new))