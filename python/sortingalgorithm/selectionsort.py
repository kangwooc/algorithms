# O(N ^ 2)
def selection_sort(li):
    for i in range(len(li)):
        minimum_idx = i
        for x in range(i + 1, len(li)):
            if (li[x] < li[minimum_idx]):
                li[x], li[minimum_idx] = li[minimum_idx], li[x]
    return li
