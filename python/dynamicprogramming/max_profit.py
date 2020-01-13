def max_profit(price_list, count):
    # 코드를 작성하세요.
    table = [0]
    for i in range(1, count + 1):
        # profit은 count개를 팔아서 가능한 최대 수익을 저장하는 변수
        # 팔려고 하는 총개수에 대한 가격이 price_list에 있으면 일단 그 가격으로 설정
        # 팔려고 하는 총개수에 대한 가격이 price_list에 없으면 일단 0으로 설정
        profit = 0
        if i < len(price_list):
            profit = price_list[i]

        # count개를 팔 수 있는 조합들을 비교해서, 가능한 최대 수익을 찾는다
        for k in range(1, i//2 + 1):
            profit = max(profit, table[k] + table[i - k])
        table.append(profit)

    return table[count]


# 테스트
print(max_profit([0, 200, 600, 900, 1200, 2000], 5))
print(max_profit([0, 300, 600, 700, 1100, 1400], 8))
print(max_profit([0, 100, 200, 400, 600, 900, 1200, 1300, 1500, 1800], 9))
