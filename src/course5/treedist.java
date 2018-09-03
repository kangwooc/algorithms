package course5;

import java.util.Scanner;

public class treedist {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int X = sc.nextInt();
        int Y = sc.nextInt();
        Node root = new Node(sc.nextInt());
        Node child = new Node(sc.nextInt());
        Tree tree = new Tree(root, n);
        tree.add(root, child);
        for (int i = 0; i < n - 2; i++) {
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

        public Tree(Node root, int size) {
            this.root = root;
            visited = new boolean[size];
            tree = new int[size];
        }

        public void add(Node parent, Node child) {
//            if (parent.leftChild == null) {
//                parent.setLeftChild(child);
//            } else {
//                Node temp = parent.leftChild;
//                while (temp.rightSibling != null) {
//                    temp = temp.rightSibling;
//                }
//                temp.setRightSibling(child);
//            }

            this.tree[child.data] = parent.data;
        }

        public void nodeDist(int x, int y) {
            int dist = 0;
            int tempX = x, tempY = y;
            if (x == y) {
                System.out.println(0);
                return;
            }
            int commonAncester = findCommonAncester(x, y);
            while (tempX != commonAncester) {
                tempX = tree[tempX];
                dist++;
            }
            while(tempY != commonAncester) {
                tempY = tree[tempY];
                dist++;
            }
            System.out.println(dist);
        }

        public int findCommonAncester(int n1, int n2) {
            int temp = n1;
            if (n1 == n2) {
                return temp;
            }
            while(temp != root.data) {
                visited[temp] = true;
                temp = tree[temp];
            }
            int ancester = n2;
            while (ancester != root.data) {
                if (visited[ancester]) {
                    break;
                }
                else ancester = tree[ancester];
            }
            return ancester;
        }
    }
}