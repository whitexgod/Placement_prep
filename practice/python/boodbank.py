class Blood:
    def __init__(self,bloodGroup,unitInHand):
        self.bloodGroup = bloodGroup
        self.unitInHand = unitInHand

class BloodBank:
    def __init__(self,l):
        self.l=l

    def isBlood(self,blood_req,unit_req):
        for i in self.l:
            if(i.bloodGroup==blood_req and i.unitInHand>=unit_req):
                return True
        return False 
    

if __name__=='__main__':
    n=int(input("Enter the number of inputs : "))
    l=[]
    for _ in range(n):
        bg=input('Enter the blood group : ')
        unit=int(input('Enter the unit in hand : '))
        l.append(Blood(bg,unit))
    obj=BloodBank(l)
    if(obj.isBlood(input("Enter the required blood group : "),int(input('Enter the required unit of blood : ')))):
        print('Blood is available.')
    else:
        print('Blood is not available.')
        
