# POLYMORPHISM
"""
1. Duck Typing
2. Operator Overloading
3. Method OverLoading
4. Method Overridding
"""

#Starting with duck typing example

class PyCharm:
    def execute():
        print("Compiling...")
        print("Executing...")
        print("Complete!")

class MyEditor:
    def execute():
        print("Spell Checking...")
        print("Symantic checking...")
        print("Compiling...")
        print("Executing...")
        print("Complete!")

class Laptop:
    def __init__(self,IDE):
        IDE.execute()

# lap1 = Laptop(PyCharm)
# lap2 = Laptop(MyEditor)


#2. operator overloading

class Student:
    def __init__(self,m1,m2):
        self.m1=m1
        self.m2=m2

    def __add__(self,other):
        m1=self.m1 + other.m1
        m2=self.m2 + other.m2
        s3 = Student(m1,m2)
        return s3

    def __str__(self) -> str:
        return ("{} {}".format(self.m1, self.m2))

s1 = Student(50,60)
s2 = Student(70,80)

s3 = s1 + s2

# print(s3)

#3. Method overloading:
"""
Here we have ame method names with different set of parameters.
LIKE,
avg(a,b)
avg(a,b,c)

But Method overloading is not suppoted in python directly
"""

#4. Method Overriding

"""
Same method name with same set of parameters.
two classes with same method name is possibel and using inheritance we can override.
"""

