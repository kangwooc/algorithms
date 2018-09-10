package course4;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class tree {
    public static void main(String[] args) throws Exception {
        BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(sc.readLine());
        BinaryTree t = new BinaryTree();
        char[] ch;
        for (int i = 0; i < num; i++) {
            ch = sc.readLine().replaceAll(" ", "").toCharArray();
            t.add(ch[0], ch[1], ch[2]);
        }
        t.preOrder(t.root);
        System.out.println();
        t.inOrder(t.root);
        System.out.println();
        t.postOrder(t.root);
        sc.close();
    }
    static class TreeNode {
        char data;
        TreeNode left, right;

        public TreeNode(char data) {
            this.data = data;
        }
    }

    static class BinaryTree {
        TreeNode root;

        public void add(char data, char left, char right) {
            if (root == null) {
                if (data != '.') root = new TreeNode(data);
                if (left != '.') root.left = new TreeNode(left);
                if (right != '.') root.right = new TreeNode(right);
            } else {
                search(root, data, left, right);
            }
        }

        private void search(TreeNode root, char data, char left, char right) {
            if (root == null) return;
            else if (root.data == data) {
                if (left != '.') root.left = new TreeNode(left);
                if (right != '.') root.right = new TreeNode(right);
            } else {
                search(root.left, data, left, right);
                search(root.right, data, left, right);
            }
        }

        //root -> left -> right
        public void preOrder(TreeNode root) {
            System.out.print(root.data);
            if (root.left != null) preOrder(root.left);
            if (root.right != null) preOrder(root.right);
        }

        // left -> root -> right
        public void inOrder(TreeNode root) {
            if (root.left != null) inOrder(root.left);
            System.out.print(root.data);
            if (root.right != null) inOrder(root.right);

        }

        // left -> right -> root
        public void postOrder(TreeNode root) {
            if (root.left != null) postOrder(root.left);
            if (root.right != null) postOrder(root.right);
            System.out.print(root.data);
        }
    }
}

