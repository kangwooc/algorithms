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
        sc.close();
    }

    static class Node {
        int data;
        Node leftChild;
        Node rightSibling;
        Node parent;

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
            this.leftChild.parent = this;
        }

        public Node getLeftChild() {
            return leftChild;
        }

        public void setRightSibling(Node rightSibling) {
            this.rightSibling = rightSibling;
            this.rightSibling.parent = this.parent;
        }

        public Node getRightSibling() {
            return rightSibling;
        }
    }

    static class Tree {
        Node root;
        boolean[] visited;
        static int[] tree;

        public Tree(int size) {
            visited = new boolean[size];
            tree = new int[size];
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

            this.tree[child.data] = parent.data;
        }

        public void nodeDist(int x, int y) {
            int distX = 0, distY = 0;
            int tempX = x, tempY = y;

            if (x == y) {
                System.out.println(0);
                return;
            }
            while (tempX != 0) {
                tempX = tree[tempX];
                distX++;
            }
            while (tempY != 0) {
                tempY = tree[tempY];
                distY++;
            }
            System.out.println(distX + distY);
        }
    }
}
