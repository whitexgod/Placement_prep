#Different type of Methods
"""1. Class Method
2. Instance Method
3. Static Method"""


class student:
    school = "ABCD" #class var

    def __init__(self):
        self.name=""  #instance var
        self.age=0      #instance var

    def get_details(self): #instance method
        return("Name : {0}, Age : {1}".format(self.name, self.age))

    @classmethod #decorator
    def get_school(cls): #class method
        return cls.school

    @staticmethod #decorator
    def info(): #static method
        print("This is a static method!")

student1 = student()
student1.name = "Tuhin Mukherjee"
student1.age = 24

print(student.get_school())
print(student1.get_details())
student1.info()