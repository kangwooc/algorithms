def staircase(n):
    # 코드를 작성하세요.
    arr = []
    arr.append(1)
    arr.append(1)
    i = 2
    while i <= n:
        val = arr[i - 1] + arr[i - 2]
        arr.append(val)
        i += 1
    return arr[-1]


# 테스트
print(staircase(0))
print(staircase(6))
print(staircase(15))
print(staircase(25))
print(staircase(41))
