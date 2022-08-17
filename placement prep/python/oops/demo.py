class computer:
    def __init__(self,cpu,ram): #init is actually a constructor
        self.cpu = cpu
        self.ram = ram
    def config(self):
        print("CPU : {0}, ram : {1}".format(self.cpu, self.ram))

comp1 = computer("i5","8GB")  #creating object i.e. comp1
comp2 = computer("i7", "16GB") #creating another object i.e. comp2

computer.config(comp1)
computer.config(comp2)

comp1.config()
comp2.config()

print(id(comp1)) #address of comp1
