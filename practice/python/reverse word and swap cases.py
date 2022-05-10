sentence="GOod BoY"
def swap(word):
    str=""
    for each in word:
        if each.isupper():
            str=str+each.lower()
        else:
            str=str+each.upper()
    return str
swaped=swap(sentence)
word=swaped.split()
word=list(reversed(word))
print(" ".join(word))