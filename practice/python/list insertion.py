def mutate_string(string, position, character):
    list=[]
    for i in range(len(string)):
        list.append(string[i])
    list[position:position+1]=character
    s=""
    for i in list:
        s=s+i
    return s

if __name__ == '__main__':
    s = input()
    i, c = input().split()
    s_new = mutate_string(s, int(i), c)
    print(s_new)