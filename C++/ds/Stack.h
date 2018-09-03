#include <iostream>

#define SIZE 1000

class Stack {
    int* arr;
    int i, size;

    Stack::Stack() {
        this->arr = new int[SIZE];
        this->i = -1;
        this->size = 0;
    }

    void Stack::push(int element) {
        arr[++i] = element;
        size++;
    }

    int Stack::pop() {
        int temp = arr[i];
        arr[i] = 0;
        i--;
        size--;
        return temp;
    }

    int Stack::peek() {
        return arr[i];
    }

    int Stack::getSize() {
        return size;
    }

    Stack::~Stack() {
        delete arr;
    }
};