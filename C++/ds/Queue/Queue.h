#include <iostream>

#define SIZE 100

class Queue {
    int* arr;
    int capacity;
    int front;
    int rear;
    int count;
    public:
        Queue(int size = SIZE);
        int Queue::dequeue();
        void Queue::enqueue();
        ~Queue();
};