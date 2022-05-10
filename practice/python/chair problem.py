import os

def minChairs(simulations):
    chair=0
    no_of_chair_avilable=1
    for each in simulations:
        if ((each=="C") or (each=="U")):
            if chair==0:
                chair += 1
                no_of_chair_avilable -= 1
            elif chair>=1:
                if (no_of_chair_avilable>=1):
                    no_of_chair_avilable-=1
                else:
                    chair += 1
                    if no_of_chair_avilable>0:
                        no_of_chair_avilable -= 1
        elif ((each=="R") or (each=="L")):
            no_of_chair_avilable+=1
    return str(chair)

simulations=['C','C','R','R','U','L']
r=minChairs(simulations)
print(r)