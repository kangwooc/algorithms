package datastructure;

public class Stack<T> {
    T data;
    T[] arr;
    int index;

    public Stack() {
        index = 0;
        arr = (T[]) new Object[1000];
    }

    public void push(T data) {
        arr[index++] = data;
    }

    public T peek() {
        return arr[index];
    }

    public T pop() {
        index--;
        return arr[index];
    }

    public int size() {
        return index;
    }
}
