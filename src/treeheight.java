import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
// practice for implementing tree

public class treeheight {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int r = sc.nextInt();
        Node root = new Node(r);
        Tree tree = new Tree(root, n);
        for (int i = 0; i < n - 1; i++) {
            Node n1 = tree.getNode(sc.nextInt());
            int n2 = sc.nextInt();
            tree.add(n1, n2);
        } // setting tree
        System.out.println();
        sc.close();
    }

    // left child / right sibling expression
    // 왼쪽 자식과 오른쪽 형제에 대한 포인터를 갖고 있는 노드의 구조. 매우 간편하며 이 방법만으로도 N개의 차수를 가진 노드 표현이
    // 쉽게 가능해진다.
    static class Node {
        int data;
        Node leftChild;
        Node rightSibling;
        Node parent;

        public Node(int data) {
            this.data = data;
            this.parent = null;
            this.leftChild = null;
        }

        public void setData(int data) {
            this.data = data;
        }

        public int getData() {
            return data;
        }

        public void addLeftChild(Node child) {
            this.leftChild = child;
            this.leftChild.parent = this;
        }

        public Node getLeftChild() {
            return leftChild;
        }

        public void addRightSibling(Node node) {
            this.rightSibling = node;
            this.rightSibling.parent = this.parent;
        }

        public Node getRightSibling() {
            return rightSibling;
        }

    }

    static class Tree {
        Node root;
        static boolean[] visited;
        static int[] tree;

        public Tree(Node root, int nV) {
            this.root = root;
            visited = new boolean[nV];
            tree = new int[nV];
        }

        public void add(Node parent, int child) {
            if (parent.getLeftChild() == null) { // when parent doesn't have left Node
                parent.addLeftChild(new Node(child));
            } else {
                // exist left Node
                Node temp = parent.getLeftChild();
                while (temp.rightSibling != null) {
                    temp = temp.getRightSibling();
                }
                temp.addRightSibling(new Node(child));
            }
            tree[child] = parent.data;
        }

        public Node getNode(int data) {
            return null;
        }

        // use bfs
        public int maxHeight(Node node) {
            if (root == null) {
                return 0;
            } else {
                Queue q = new LinkedList();
                q.add(node);
                int height = 0;
                while (!q.isEmpty()) {
                    Node element = (Node) q.remove();
                    if (element == null) {
                        if (!q.isEmpty()) {
                            q.add(null);
                        }
                        height++;
                    } else {
                        Node temp = element;
                        while (temp.rightSibling != null) {
                            q.add(temp);
                            temp = temp.getRightSibling();
                        }
                    }
                }
                return height;
            }
        }


    }
}