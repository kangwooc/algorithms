import java.util.Scanner;

public class tree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        Node node = new Node();
        node.setData(sc.next());
    }


}

class Node {
    String data;
    Node left, right;
    public Node() {
        data = null;
        left = null;
        right = null;
    }

    public void setData(String data) {
        this.data = data;
    }

    //root -> left -> right
    public void preOrder() {

    }
    // left -> root -> right
    public void inOrder() {

    }
    // left -> right -> root
    public void postOrder() {

    }
}