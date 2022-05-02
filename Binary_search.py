
def binarySearch(arr, element, lb, ub):
    try:
        middle=int((lb+ub)/2)
        if (arr[middle]==element):
            print("Element found!")
        else:
            if (arr[middle]>element):
                return binarySearch(arr, element, lb, middle-1)
            else:
                return binarySearch(arr, element, middle+1, ub)
    except:
        print ("Element not found!")
        
n=int(input())
arr = list(map(int,input().strip().split()))[:n]
element = int(input());
binarySearch(arr,element,0,n)