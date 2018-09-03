package datastructure;

public class LinkedList<K> {

    class Node {
        K data;
        Node next;
        public Node(K data) {
            this.data = data;
            this.next = null;
        }
    }
}

