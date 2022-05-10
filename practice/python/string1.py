class string():

    def get_string(self):
        s=input("Enter a string\n")
        return s

    def print_string(self,str):
        print(str.upper())

write = string()

write.print_string(write.get_string())