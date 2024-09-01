def sum_even_and_odd(arr):
    esum = 0
    osum = 0
    for i in arr:
        if(i%2==0):
            esum = esum + i
        else:
            osum = osum + i

    return (esum, osum)

def main():
    n = int(input())
    arr = []
    esum = 0
    osum = 0
    for i in range(n):
        num = int(input())
        arr.append(num)

    res = sum_even_and_odd(arr)
    print(res[0])
    print()
    print(res[1])
    
    

main()