def merge(list1, list2):
    # 코드를 작성하세요.
    i, j = 0, 0
    merged_list = []
    while i < len(list1) and j < len(list2):
        if list1[i] >= list2[j]:
            merged_list.append(list2[j])
            j = j + 1
        else:
            merged_list.append(list1[i])
            i = i + 1

    while i < len(list1):
        merged_list.append(list1[i])
        i = i + 1

    while j < len(list2):
        merged_list.append(list2[j])
        j = j + 1

    return merged_list


def merge_sort(my_list):
    # 코드를 입력하세요.
    if len(my_list) < 2:
        return my_list
    mid_index = len(my_list) // 2
    return merge(merge_sort(my_list[:mid_index]), merge_sort(my_list[mid_index:]))
