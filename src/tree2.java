import java.util.Scanner;

public class tree2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        char[][] ch = new char[1000][3];
        for (int i = 0; i < num; i++) {
            char root = sc.next().charAt(0);
            char left = sc.next().charAt(0);
            char right = sc.next().charAt(0);

            ch[root - 'A'][0] = root;
            if (left != '.') ch[left - 'A'][0] = left;
            if (right != '.') ch[right - 'A'][0] = right;
        } // setting tree
        //preOrder(ch, 'A');
        System.out.println();
        //inOrder(ch, 'A');
        System.out.println();
        //postOrder(ch, 'A');
    }

    // root -> left -> right
    private static void preOrder(char[] ch, char root) {
        if (root != '.') {
            System.out.print(ch[root - 'A']);
            //preOrder(ch);
            //preOrder(ch);
        }
    }
    // left - > root -> right
    private static void inOrder(char[] ch, char root) {
        //if (root != '.')
    }
    // left -> right -> root
    private static void postOrder(char[] ch, char root) {

    }
}
