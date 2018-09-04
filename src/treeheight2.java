import java.util.Scanner;

public class treeheight2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int root = sc.nextInt();

        NodeTemp rootNode = new NodeTemp(root);

        for (int i = 0; i < n - 1; i++) {
            NodeTemp node = addChild(rootNode, sc.nextInt());
        }
    }

    static class NodeTemp {
        int data;
        NodeTemp next, child;
        public NodeTemp(int data) {
            this.data = data;
            next = child = null;
        }
    }

    // Adds a sibling to a list with starting with n
    static public NodeTemp addSibling(NodeTemp node, int data) {
        if(node == null)
            return null;
        while(node.next != null)
            node = node.next;
        return(node.next = new NodeTemp(data));
    }

    // Add child Node to a Node
    static public NodeTemp addChild(NodeTemp node,int data) {
        if(node == null)
            return null;

        // Check if child is not empty.
        if(node.child != null)
            return(addSibling(node.child,data));
        else
            return(node.child = new NodeTemp(data));
    }

    // Traverses tree in level order
    static public void traverseTree(NodeTemp root) {
        if(root == null)
            return;
        while(root != null)
        {
            System.out.print(root.data + " ");
            if(root.child != null)
                traverseTree(root.child);
            root = root.next;
        }
    }
}
