#include <iostream>

#define SIZE 1000

class Stack {
    int* arr;
    int i, size;
    public:
        Stack::Stack();
        void Stack::push(int element);
        int Stack::pop();
        int Stack::peek();
        int Stack::getSize();
        Stack::~Stack();
};