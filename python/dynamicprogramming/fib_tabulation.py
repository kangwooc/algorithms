# Time-Complexity: O(N)
# Space-Complexity: O(N)


def fib_tab(n):
    # 코드를 작성하세요.
    table = []
    for i in range(n + 1):
        if i < 2:
            table.append(1)
        else:
            table.append(table[i - 1] + table[i - 2])
    return table[n - 1]


# 테스트
print(fib_tab(10))
print(fib_tab(56))
print(fib_tab(132))
