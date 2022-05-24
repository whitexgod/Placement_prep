from collections import deque

a = ['t','u','h','i','n']
d = deque(a)
print(d)
d.appendleft('I am')
print(d)
d.popleft()
print(d)