#include <iostream>
using namespace std;
void bubbleSort(int*);

void bubbleSort(int* arr) {
    for (int i = 0; i < (sizeof(arr) / sizeof(int)) - 1; i++) {
        if (arr[i] > arr[i + 1]) {
            int temp = arr[i + 1];
            arr[i + 1] = arr[i];
            arr[i] = temp;
        }
    }
}

int main(int argc, char const *argv[]) {
    /* code */
    int* arr = new int[100];
    for (int i = 0; i < 100; i++) {
        scanf("%d", arr[i]);
    }
    bubbleSort(arr);
    return 0;
}