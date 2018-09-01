import java.util.Scanner;

public class treedist {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int X = sc.nextInt();
        int Y = sc.nextInt();
        Tree tree = new Tree(n);
        for (int i = 0; i < n - 1; i++) {
            Node n1 = new Node(sc.nextInt());
            Node n2 = new Node(sc.nextInt());
            tree.add(n1, n2);
        }
        tree.nodeDist(X, Y);
    }

    static class Node {
        int data;
        Node leftChild;
        Node rightSibling;

        public Node(int data) {
            this.data = data;
        }

        public void setData(int data) {
            this.data = data;
        }

        public int getData() {
            return data;
        }

        public void setLeftChild(Node leftChild) {
            this.leftChild = leftChild;
        }

        public Node getLeftChild() {
            return leftChild;
        }

        public void setRightSibling(Node rightSibling) {
            this.rightSibling = rightSibling;
        }

        public Node getRightSibling() {
            return rightSibling;
        }
    }

    static class Tree {
        Node root;
        boolean[] visited;

        public Tree(int size) {
            visited = new boolean[size];
        }

        public void add(Node parent, Node child) {
            if (parent.leftChild == null) {
                parent.setLeftChild(child);
            } else {
                Node temp = parent.leftChild;
                while (temp.rightSibling != null) {
                    temp = temp.rightSibling;
                }
                temp.setRightSibling(child);
            }
        }

        public void nodeDist(int x, int y) {

        }
    }
}
