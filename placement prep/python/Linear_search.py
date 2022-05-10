def linear_search(arr,element):
    frequency = 0
    temp=0
    for each in arr:
        temp += 1
        if each==ele:
            frequency += 1
            print("Element found at : ",temp)
    if(frequency==0):
        print("Element not present in the array")
    print("The frequency of the element in the array is : ",frequency)

arr = list(map(int, input().strip().split()))[:]
ele = int(input())
linear_search(arr,ele)
