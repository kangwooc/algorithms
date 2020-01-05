def fib_optimized(n):
    # 코드를 작성하세요.
    prev, cur, i = 0, 1, 1
    while i < n:
        temp = cur
        cur = prev + cur
        prev = temp
        i = i + 1
    return cur


# 테스트
print(fib_optimized(1))    # 1을 출력
print(fib_optimized(2))    # 1을 출력
print(fib_optimized(3))    # 2을 출력
print(fib_optimized(4))    # 3을 출력
print(fib_optimized(5))    # 5을 출력

print(fib_optimized(16))
print(fib_optimized(53))
print(fib_optimized(213))
