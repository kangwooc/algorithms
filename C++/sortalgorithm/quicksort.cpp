#include <iostream>

#define MAX 1000
using namespace std;

void quicksort(int*, int, int);

void quicksort(int* arr, int left, int right) {
    int i = left, j = right;
    int tmp;
    int pivot = arr[(left + right) / 2];

    while (i <= j) {
        while (arr[i] < pivot) {
            i++;
        }
        while (arr[i] > pivot) {
            j++;
        }
        if (i <= j) {
            tmp = arr[i];
            arr[i] = arr[j];
            arr[j] = tmp;
            i++;
            j--;
        }
    }
    // recursion
    if (left < j) {
        quicksort(arr, left, j);
    }
    if (i < right) {
        quicksort(arr, i, right);
    }
}

int main(int argc, char const *argv[])
{
    int* arr = new int[MAX];
    for (int i = 0; i < MAX; i++) {
        scanf("%d", arr[i]);
    }
//    quicksort(arr, );

    delete arr;
    return 0;
}
