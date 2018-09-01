import java.util.Scanner;
// treat n itself as ancester
// the number of tree's edges = nV - 1 except root
public class ancester {
    static int nV, X, Y;
    static Tree tree;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        nV = sc.nextInt();
        X = sc.nextInt();
        Y = sc.nextInt();
        TreeNode root = new TreeNode(sc.nextInt());
        TreeNode child = new TreeNode(sc.nextInt());
        tree = new Tree(root, nV);
        tree.add(root, child);
        for (int i = 0; i < nV - 2; i++) {
            int num1 = sc.nextInt();
            int num2 = sc.nextInt();
            TreeNode n1 = new TreeNode(num1);
            TreeNode n2 = new TreeNode(num2);
            tree.add(n1, n2);
        } // set tree

        int answer = tree.findCommonAncester(X, Y);
        System.out.println(answer);
    }

    // left child / right sibling expression
    // 왼쪽 자식과 오른쪽 형제에 대한 포인터를 갖고 있는 노드의 구조. 매우 간편하며 이 방법만으로도 N개의 차수를 가진 노드 표현이
    // 쉽게 가능해진다.
    static class TreeNode {
        int data;
        TreeNode leftChild;
        TreeNode rightSibling;
        TreeNode parent;

        public TreeNode(int data) {
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

        public void addLeftChild(TreeNode child) {
            this.leftChild = child;
            this.leftChild.parent = this;
        }

        public TreeNode getLeftChild() {
            return leftChild;
        }

        public void addRightSibling(TreeNode node) {
            this.rightSibling = node;
            this.rightSibling.parent = this.parent;
        }

        public TreeNode getRightSibling() {
            return rightSibling;
        }

    }

    static class Tree {
        TreeNode root;
        static boolean[] visited;
        static int[] tree;

        public Tree(TreeNode root, int nV) {
            this.root = root;
            visited = new boolean[nV];
            tree = new int[nV];
        }

        public void add(TreeNode parent, TreeNode child) {
            if (parent.getLeftChild() == null) { // when parent doesn't have left Node
                parent.addLeftChild(child);
            } else {
                // exist left Node
                TreeNode temp = parent.getLeftChild();
                while (temp.rightSibling != null) {
                    temp = temp.getRightSibling();
                }
                temp.addRightSibling(child);
            }
            tree[child.data] = parent.data;
        }

        public int findCommonAncester(int n1, int n2) {
            int temp = n1;
            while(tree[temp] != root.data) {
                visited[temp] = true;
                temp = tree[temp];
            }
            int ancester = n2;

            while (tree[ancester] != root.data) {
                if (visited[ancester]) {
                    ancester = tree[ancester];
                    break;
                }
                else ancester = tree[ancester];
            }

            if (ancester == n2) {
                ancester = root.data;
            }
            return ancester;
        }
    }
}