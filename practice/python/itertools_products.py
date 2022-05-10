from itertools import product
K,M=map(int, input().split())
N=(list(map(int, input().split()))[1:] for _ in range(K))
def fun(num):
    return (sum(i*i for i in num)%M)
print(max(map(fun, list(product(*N)))))

