import java.util.Scanner;

public class tree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int index = 0;
        char[] c = new char[1000];
        for (int i = 0; i <= num ; i++) {
            setTree(c, sc.next().charAt(0));
        }

    }
    public static void setTree(char[] c, char ch) {

    }

    public static void preOrder(char[] c) {
        if (data != '.') {
            System.out.print(char[][].data);
            preOrder(char[][].left);
            preOrder(char[][].right);
        }

    }

    // left -> root -> right
    public static void inOrder(char[] c) {
        if (data != '.') {
            inOrder(char[][].left);
            System.out.print(char[][].data);
            inOrder(char[][].right);
        }

    }

    // left -> right -> root
    public static void postOrder(char[] c) {
        if (data != '.') {
            postOrder(char[][].left);
            postOrder(char[][].right);
            System.out.print(char[][].data);
        }
    }
}

