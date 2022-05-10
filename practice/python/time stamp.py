def timeConversion(s):
    if (s[-2:]=="PM"):
        if (int(s[:2])==12):
            return (s[:-2])
        else:
            temp=(int(s[:2])+12)
            return(str(temp)+s[2:-2])
    else:
        if (int(s[:2])==12):
            return("00"+s[2:-2])
        else:
            return(s[:-2])

s="12:45:54PM"
r=timeConversion(s)
print(r)