class Difference:
    def __init__(self, a):
        self.__elements = a

    def computeDifference(self):
        list=[]
        list = self.__elements
        dif = []
        for i in range(len(list)):
            for j in range(len(list)):
                d = (abs(list[i] - list[j]))
                if d not in dif:
                    dif.append(d)
        self.maximumDifference=(int(max(dif)))

    def maximumDifference(self):
        return
# End of Difference class

_ = input()
a = [int(e) for e in input().split(' ')]

d = Difference(a)
d.computeDifference()

print(d.maximumDifference)