#class within a class
#inner class and outer class

class Student:
    def __init__(self,name,age):
        self.name = name
        self.age = age
        # self.lap = self.Laptop()

    def show(self):
        print(self.name, self.age)
        # self.lap.show()

    class Laptop: #inner class
        def __init__(self,brand,cpu,ram):
            self.brand = brand
            self.cpu = cpu
            self.ram = ram

        def show(self):
            print(self.brand, self.cpu, self.ram)

student1 = Student("Tuhin Mukherjee", 24)
lap1 = Student.Laptop("Acer","i7","16GB")

student1.show()
lap1.show()