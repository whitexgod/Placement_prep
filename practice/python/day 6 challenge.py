if __name__ == "__main__":
    n=int(input())
    list=[]
    for i in range(n):
        list.append(input())
    for each_word in list:
        word=each_word
        new_word1=[]
        new_word2=[]
        for i in range(len(word)):
            if i%2==0:
                new_word1.append(word[i])
            else:
                new_word2.append(word[i])
        final1=""
        final2=""
        for i in new_word1:
            final1=final1+i
        for i in new_word2:
            final2=final2+i
        print(final1, final2)
