#INHERITANCE
# super() is used to reffer or call super class

class A:
    def __init__(self):
        print("init of A")
    def feature1(self):
        print("Feature 1 is working")
    def feature2(self):
        print("Feature 2 is working")

class B(A): #class B inheriting class A thus A is the parent and B is the child
    def __init__(self):
        super().__init__()
        print("init of B")
    def feature3(self):
        print("Feature 3 is working")

class C(B): #class C is inheriting B thus inheriting A also
    def __init__(self):
        super().__init__()
        print("init of C")
    def feature4(self):
        print("Feature 4 is working")

class D:
    def __init__(self):
        print("init of D")
    def feature5(self):
        print("Feature 5 is working")

class E(C,D): #multiple inheritance #Follows MRO Method Resolution Order left -> rights
    def __init__(self):
        super().__init__()
        print("init of E")
    def feature6(self):
        print("Feature 6 is working")

# obj = E()
# E.feature1(obj)
# E.feature2(obj)
# E.feature3(obj)
# E.feature4(obj)
# E.feature5(obj)
# E.feature6(obj)

obj = E()
