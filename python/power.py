# def power(x, y):
#     # 코드를 작성하세요.
#     if y == 1:
#         return x
#     return x * power(x, y - 1)


def power(x, y):
    if y == 1:
        return x
    # 계산을 한 번만 하기 위해서 변수에 저장
    subresult = power(x, y // 2)
    # 문제를 최대한 똑같은 크기의 문제 두 개로 나눠준다 (짝수, 홀수 경우 따로)
    if y % 2 == 0:
        return subresult * subresult
    else:
        return x * subresult * subresult

    # 테스트
print(power(3, 5))
print(power(5, 6))
print(power(7, 9))
