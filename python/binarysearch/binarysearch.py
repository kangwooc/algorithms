# linear search =>o(N)
# binary search => o(logN)


def binary_search(element, some_list):
    # 코드를 작성하세요.
    first = 0
    end = len(some_list) - 1
    while first <= end:
        mid = (first + end) // 2
        if some_list[mid] == element:
            return mid
        if some_list[mid] < element:
            first = mid + 1
        elif some_list[mid] > element:
            end = mid - 1

    return None


print(binary_search(2, [2, 3, 5, 7, 11]))
print(binary_search(0, [2, 3, 5, 7, 11]))
print(binary_search(5, [2, 3, 5, 7, 11]))
print(binary_search(3, [2, 3, 5, 7, 11]))
print(binary_search(11, [2, 3, 5, 7, 11]))
