n, v = list(map(int, input().split()))
# print(type(n))
# print(v)
ct = 0
for i in range(0, n):
    lst = list(map(int, input().split()))
    s = lst[0]
    lst = lst[1:]
    for j in lst:
        if(v>j):
            ct +=1
            print(ct, end=" ")