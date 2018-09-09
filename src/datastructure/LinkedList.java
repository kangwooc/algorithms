package datastructure;

public class LinkedList<K> {
    Node head;

    class Node {
        K data;
        Node next;
        public Node(K data) {
            this.data = data;
            this.next = null;
        }
    }

    public LinkedList(Node head) {
        this.head = head;
    }
}

