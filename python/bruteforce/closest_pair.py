from math import sqrt

# 두 매장의 직선 거리를 계산해 주는 함수


def distance(store1, store2):
    return sqrt((store1[0] - store2[0]) ** 2 + (store1[1] - store2[1]) ** 2)


# 가장 가까운 두 매장을 찾아주는 함수
def closest_pair(coordinates):
    # 여기 코드를 쓰세요
    closest_dist = float("inf")
    pair = []
    for i in range(len(coordinates) - 1):
        for j in range(i + 1, len(coordinates)):
            temp = closest_dist
            closest_dist = min(closest_dist, distance(
                coordinates[i], coordinates[j]))
            if temp != closest_dist:
                pair = []
                pair.append(coordinates[i])
                pair.append(coordinates[j])

    return pair


# 테스트
test_coordinates = [(2, 3), (12, 30), (40, 50), (5, 1), (12, 10), (3, 4)]
print(closest_pair(test_coordinates))
