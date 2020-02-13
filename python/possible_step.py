'''
영훈이는 출근할 때 계단을 통해 사무실로 가는데요. 급할 때는 두 계단씩 올라가고 여유 있을 때는 한 계단씩 올라갑니다. 
결국 계단을 오를 수 있는 모든 방법으로 계단을 올라갔는데요.


이제 다르게 계단을 올라갈 수는 없을까 고민하던 영훈이는 특이한 방법으로 계단을 오르려고 합니다.


가령 계단을 한 번에 1, 2, 4 칸씩 올라가 보는 건데요. 예를 들어서 계단을 4개를 올라가야 되면:


1, 1, 1, 1
2, 1, 1
1, 2, 1
1, 1, 2
2, 2
4

총 5개 방법이 있네요.


함수 staircase는 파라미터로 총 계단 수 n 그리고 한 번에 올라갈 수 있는 계단 수를 possible_steps로 받고, 
올라갈 수 있는 방법의 수를 효율적으로 찾아서 리턴합니다.


그러니까 n이 3, possible_steps 가 [1, 2, 3]이면, 계단 총 3칸을 1, 2, 3칸씩 갈 수 있을 때 오르는 방법의 수를 수하는 거죠.


단, possible_steps에는 항상 1이 포함된다고 가정합니다.
'''

# 높이 n개의 계단을 올라가는 방법을 리턴한다
def staircase(stairs, possible_steps):
    # 코드를 쓰세요
    if stairs == 0:
        return 1
    num = 0
    for i in possible_steps:
        if stairs >= i:
            num += staircase(stairs - i, possible_steps)
    return num
    
# 높이 n개의 계단을 올라가는 방법을 리턴한다
def staircase(stairs, possible_steps):
    # 계단 높이가 0 이거나 1 이면 올라가는 방법은 한 가지밖에 없다
    number_of_ways = [1, 1]
    
    # 이 변수들을 업데이트 해주며 n 번째 계단을 오르는 방법의 수를 구한다.
    for height in range(2, stairs + 1):
        number_of_ways.append(0)

        for step in possible_steps:
            # 음수 계단 수는 존재하지 않기 때문에 무시합니다
            if height - step >= 0:
                number_of_ways[height] += number_of_ways[height - step]

    return number_of_ways[stairs]



print(staircase(5, [1, 2, 3]))
print(staircase(6, [1, 2, 3]))
print(staircase(7, [1, 2, 4]))
print(staircase(8, [1, 3, 5]))
