import java.util.Scanner;

public class tree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for (int i = 0; i < num * 3; i++) {
            char ch1 = sc.next().charAt(0);
            char ch2 = sc.next().charAt(0);
            char ch3 = sc.next().charAt(0);
        }
    }


}

class TreeNode {

    char data;
    TreeNode left, right;

    public TreeNode(char data) {
        this.data = data;
        left = null;
        right = null;
    }

    //root -> left -> right
    public void preOrder(TreeNode TreeNode) {
        if (data != '.') {
            System.out.print(TreeNode.data);
            preOrder(TreeNode.left);
            preOrder(TreeNode.right);
        }

    }

    // left -> root -> right
    public void inOrder(TreeNode TreeNode) {
        if (data != '.') {
            inOrder(TreeNode.left);
            System.out.print(TreeNode.data);
            inOrder(TreeNode.right);
        }

    }

    // left -> right -> root
    public void postOrder(TreeNode TreeNode) {
        if (data != '.') {
            postOrder(TreeNode.left);
            postOrder(TreeNode.right);
            System.out.print(TreeNode.data);
        }
    }
}