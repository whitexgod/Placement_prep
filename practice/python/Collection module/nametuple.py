from collections import namedtuple

a = namedtuple('Courses', 'name, tech')
s1 = a('data Science', 'python')
s2 = a('web development','html')
s=a._make([['data Science', 'web development'],['python','html']])
print(s1,'\n', s2) 
print(s)