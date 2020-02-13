'''
규식이는 친구들 사이에서 투자의 귀재로 알려져 있습니다. 페이수북과 인수타그램에 자신의 성과를 과시하기 때문인데요. 
사실 규식이가 그 정도의 실력자는 아닙니다. 성과가 좋을 때에만 SNS에 공유해서 그렇게 비춰질 뿐이죠.
계속해서 멋진 모습을 보여주기 위해, 특정 기간 중 수익이 가장 큰 구간을 찾아내는 함수 sublist_max를 작성해 보려고 합니다.

Divide and Conquer O(logn)
'''
def sublist_max(profits, start, end):
    # 코드를 작성하세요.
    if start == end: 
        return profits[start]
    mid = (start + end) // 2
    left_sum = sublist_max(profits, start, mid)
    right_sum = sublist_max(profits, mid + 1, end)

    


    return 




# 테스트
list1 = [-2, -3, 4, -1, -2, 1, 5, -3]
print(sublist_max(list1, 0, len(list1) - 1))

list2 = [4, 7, -6, 9, 2, 6, -5, 7, 3, 1, -1, -7, 2]
print(sublist_max(list2, 0, len(list2) - 1))

list3 = [9, -8, 0, -7, 8, -6, -3, -8, 9,
         2, 8, 3, -5, 1, -7, -1, 10, -1, -9, -5]
print(sublist_max(list3, 0, len(list3) - 1))

list4 = [-9, -8, -8, 6, -4, 6, -2, -3, -10, -8, -9, -9, 6, 2, 8, -1, -1]
print(sublist_max(list4, 0, len(list4) - 1))
