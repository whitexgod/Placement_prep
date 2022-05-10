if __name__ == '__main__':
    list=[]
    for _ in range(int(input())):
        a=[]
        name = input()
        a.append(name)
        score = float(input())
        a.append(score)
        list.append(a)
    score=[]
    for i in range(len(list)):
        score.append((list[i][1]))
    min_val=min(score)
    new_score=[]
    for i in range(len(score)):
        if(score[i]!=min_val):
            new_score.append(score[i])
    new_score.sort()
    sec_lowest=(new_score[0])
    final_list=[]
    for i in range(len(list)):
        if(list[i][1]==sec_lowest):
            final_list.append(list[i])
    final_list.sort()
    for i in range(len(final_list)):
        print(final_list[i][0])
