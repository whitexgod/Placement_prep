class rectangle():
    def __init__(self,length,width):
        self.length = length
        self.width = width

    def area(self):
        return (self.length*self.width)


l = int(input("Enter the length of the rectangle : "))
b = int(input("Enter the breadth of the rectangle : "))
Rec = rectangle(l,b)
print("Area of the rectangle is : ",Rec.area())
