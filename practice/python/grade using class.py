
class Student:

    def __init__(self, firstName, lastName, idNumber, scores):
        self.firstName = firstName
        self.lastName = lastName
        self.idNumber = idNumber
        self.scores = scores

    def printPerson(self):
        print("Name:", self.lastName + ",", self.firstName)
        print("ID:", self.idNumber)

    def calculate(self):
        avg = int(sum(self.scores)/len(self.scores))
        if ((avg >= 90) & (avg <= 100)):
            return("O")
        elif ((avg >= 80) & (avg < 90)):
            return("E")
        elif ((avg >= 70) & (avg < 80)):
            return("A")
        elif ((avg >= 55) & (avg < 70)):
            return("P")
        elif ((avg >= 40) & (avg < 55)):
            return("D")
        elif (avg < 40):
            return("T")


line = input().split()
firstName = line[0]
lastName = line[1]
idNum = line[2]
numScores = int(input())  # not needed for Python
scores = list(map(int, input().split()))
s = Student(firstName, lastName, idNum, scores)
s.printPerson()
print("Grade:", s.calculate())