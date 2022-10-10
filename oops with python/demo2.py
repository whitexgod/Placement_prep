from turtle import right


class human:
    def __init__(self):
        self.name = "Default"
        self.age = 0

    def update(self):
        self.age+=10

    def compare(self,other):
        print("same") if self.age==other.age else print("different")

human1 = human()
human2 = human()

print(human1.age)
print(human2.age)
human1.compare(human2)

human2.update()

print(human1.age)
print(human2.age)
human1.compare(human2)

human1.update()

print(human1.age)
print(human2.age)
human1.compare(human2)
            