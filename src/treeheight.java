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
            Node n1 = new Node(sc.nextInt());
            Node n2 = new Node(sc.nextInt());
            tree.add(n1, n2);
        }
        System.out.println(tree.maxHeight(tree.root));
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
            if (parent.leftChild == null) {
                if (parent.data == root.data) {
                    root.setLeftChild(child);
                } else {
                    parent.setLeftChild(child);
                }
            } else {
                Node temp = parent.leftChild;
                while (temp.rightSibling != null) {
                    temp = temp.rightSibling;
                }
                temp.setRightSibling(child);
            }
            tree[child.data] = parent.data;
        }

        // use dfs
        public int maxHeight(Node root) {
            if (root == null) {
                return 0;
            } else {
                int max = 1;
                for (int i = root.data; i < tree.length; i++) {
                    int height = 0;
                    int index = i;
                    while (index != root.data && index != 0) {
                        index = tree[index];
                        height++;
                    }
                    if (height > max) {
                        if (index != 0) {
                            max = height;
                        } else {
                            if (root.data == 0) {
                                max = height;
                            }
                        }
                    }
                }
                return max;
            }
        }
    }
}