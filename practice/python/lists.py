n=int(input())
arr=[]
for each in range(n):
    each=each+1
    inn=input()
    if len(inn)>8:
        text, a, b = inn.split()
        if text.strip()=="insert":
            arr.insert(int(a),int(b))
    elif len(inn)==8:
        text,a=inn.split()
        if text.strip()=="remove":
            arr.remove(int(a))
        elif text.strip()=="append":
            arr.append(int(a))
    elif len(inn)<=7:
        if inn.strip()=="sort":
            arr.sort()
        elif inn.strip()=="pop":
            arr.pop()
        elif inn.strip()=="reverse":
            arr.reverse()
        elif inn.strip()=="print":
            print(arr)


      #  ---------------------------------------------------------------------------------------------------------------------

    if __name__ == '__main__':
        N = int(input())
        the_list = list()

        for _ in range(N):
            query = input().split()
            if query[0] == "print":
                print(the_list)
            elif query[0] == "insert":
                the_list.insert(int(query[1]), int(query[2]))
            elif query[0] == "remove":
                the_list.remove(int(query[1]))
            elif query[0] == "append":
                the_list.append(int(query[1]))
            elif query[0] == "sort":
                the_list = sorted(the_list)
            elif query[0] == "pop":
                the_list.pop()
            elif query[0] == "reverse":
                the_list.reverse()