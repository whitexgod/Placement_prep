from collections import Counter

a = list('111222345568999')
a = list(map(lambda x: int(x), a))
c = Counter(a)
print(c)
print(list(c.elements()))
print(c.most_common())
print(c.keys())
print(c.values())