#include "Queue.h"

Queue::Queue(int size) {
    this->arr = new int[size];
}

void Queue::enqueue() {

}

int Queue::dequeue() {
    return 0;
}

Queue::~Queue() {
    delete arr;
}