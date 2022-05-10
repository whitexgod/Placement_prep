def split_and_join(line):
    list=[]
    str=line.split()
    for i in str:
        list.append(i)
    new_str=""
    for i in range(len(list)):
        new_str=new_str+"-"+list[i]
    return new_str[1:]


if __name__ == '__main__':
    line = input()
    result = split_and_join(line)
    print(result)