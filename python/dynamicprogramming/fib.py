# Top-down approach
def fib_memo(n, cache):
    # 코드를 작성하세요.
    if n <= 2:
        cache[n] = 1
        return cache[n]
    if n in cache:
        return cache[n]
    cache[n] = fib_memo(n-1, cache) + fib_memo(n-2, cache)
    return cache[n]


def fib(n):
    # n번째 피보나치 수를 담는 사전
    fib_cache = {}

    return fib_memo(n, fib_cache)


# 테스트
print(fib(10))
print(fib(50))
print(fib(100))
