def swap_cases(s):

    if s.isupper():
        return s.lower()
    else:
        return s.upper()

def swap_case(ss):

    str=ss
    new_str=""
    for each in str:
        new_str=new_str+swap_cases(each)
    return new_str


if __name__ == '__main__':
    s = input()
    result = swap_case(s)
    print(result)