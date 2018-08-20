import java.util.Scanner;

public class tree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        BinaryTree t = new BinaryTree();
        for (int i = 0; i < num; i++) {
            char ch1 = sc.next().charAt(0);
            char ch2 = sc.next().charAt(0);
            char ch3 = sc.next().charAt(0);
            t.add(ch1, ch2, ch3);
        }
        t.preOrder(t.root);
        System.out.println();
        t.inOrder(t.root);
        System.out.println();
        t.postOrder(t.root);
        sc.close();
    }
}

class TreeNode {
    char data;
    TreeNode left, right;

    public TreeNode(char data) {
        this.data = data;
    }
}

class BinaryTree {
    TreeNode root;

    public void add(char data, char left, char right) {
        if (root == null) {
            if (data != '.') root = new TreeNode(data);
            if (left != '.') root.left = new TreeNode(data);
            if (right != '.') root.right = new TreeNode(data);
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
    public void inOrder(TreeNode node) {
        if (node.left != null) inOrder(node.left);
        System.out.print(node.data);
        if (node.right != null) inOrder(node.right);

    }

    // left -> right -> root
    public void postOrder(TreeNode node) {
        if (node.left != null) postOrder(node.left);
        if (node.right != null) postOrder(node.right);
        System.out.print(node.data);
    }
}