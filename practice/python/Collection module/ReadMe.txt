There is 4 type of collection in python
1. lists
2. tuples
3. sets
4. Dictionary 

#Special Collections Data Types are:
1. nametuple()
INPUT
from collections import nametuple

a=nametuple('Courses', 'name, technology')
s=a('data science', 'python')
print(s)

OUTPUT
courses(name='data science', technology='python')

2. Chainmap
Is used for single view of multiple map

3. deque
INPUT
from collections import deque

a = ['t','u','h','i','n']
d = deque(a)
print(d) 
d.appendleft('I am')
print(d)
d.popleft()
print(d)

OUTPUT
deque(['t', 'u', 'h', 'i', 'n'])
deque(['I am', 't', 'u', 'h', 'i', 'n'])
deque(['t', 'u', 'h', 'i', 'n'])

4. Counter
INPUT
from collections import Counter

a = list('111222345568999')
a = list(map(lambda x: int(x), a))
c = Counter(a)
print(c)
print(list(c.elements()))
print(c.most_common())
print(c.keys())
print(c.values())

OUTPUT

Counter({1: 3, 2: 3, 9: 3, 5: 2, 3: 1, 4: 1, 6: 1, 8: 1})      
[1, 1, 1, 2, 2, 2, 3, 4, 5, 5, 6, 8, 9, 9, 9]
[(1, 3), (2, 3), (9, 3), (5, 2), (3, 1), (4, 1), (6, 1), (8, 1)]                                                              ]
dict_keys([1, 2, 3, 4, 5, 6, 8, 9])
dict_values([3, 3, 1, 1, 2, 1, 1, 3])

5. OrderedDict
6. defaultdict
7. UserDict
8. UserList
9. UserString
