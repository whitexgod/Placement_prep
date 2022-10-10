#instance variable and class variable
#variables defined within __init__ are instance variable and variables defined outside are class var

class car:

    wheels = 4

    def __int__(self):
        self.company = ""
        self.millage = 0

car1 = car()
car2 = car()

car1.company = "BMW"
car1.millage = 10

car2.company = "Audi"
car2.millage = 8

print(car1.company, car1.millage, car1.wheels)
print(car2.company, car2.millage, car2.wheels)

car.wheels = 5

print(car1.company, car1.millage, car1.wheels)
print(car2.company, car2.millage, car2.wheels)

