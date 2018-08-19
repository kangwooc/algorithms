import java.util.Scanner;

public class tree2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        char[] ch = new char[1000];
        for (int i = 0; i < num * 3; i++) {
            char root = sc.next().charAt(0);
            char left = sc.next().charAt(0);
            char right = sc.next().charAt(0);

            ch[root - 'A'] = root;
            if (left != '.') ch[left - 'A'] = left;
            if (right != '.') ch[right - 'A'] = right;
        } // setting tree
        preOrder(ch);
        System.out.println();
        inOrder(ch);
        System.out.println();
        postOrder(ch);
    }
    // root -> left -> right
    private static void preOrder(char[] ch) {

    }

    private static void inOrder(char[] ch) {

    }

    private static void postOrder(char[] ch) {

    }
}
