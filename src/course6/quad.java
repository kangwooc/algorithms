package course6;

import java.util.*;

public class quad {
    static int N;
    static int[][] arr;
    static String n = new String();
    static TreeNode root;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        arr = new int[N][N];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                arr[i][j] = sc.nextInt();
            }
        }// input array
        root = new TreeNode();
        quadTree(0, 0, N, root);
        bfs(root);
        long demical = Long.parseLong(n, 2);
        String hexStr = Long.toHexString(demical);
        System.out.println(hexStr.toUpperCase());
    }
    // dfs
    private static void quadTree(int xStart, int yStart, int length, TreeNode root) {
        int initial = arr[xStart][yStart];
        for (int i = xStart; i < xStart + length; i++) {
            for (int j = yStart; j < yStart + length; j++) {
                if (initial != arr[i][j]) {
                    TreeNode child = new TreeNode("1");
                    root.children.add(child);
                    quadTree(xStart, yStart, length / 2, child);
                    quadTree(xStart, yStart + length / 2, length / 2, child);
                    quadTree(xStart + length / 2, yStart, length / 2, child);
                    quadTree(xStart + length / 2, yStart + length / 2, length / 2, child);
                    return;
                }
            }
        }
        if (initial == 0) {
            TreeNode child = new TreeNode("00");
            root.children.add(child);
        } else if (initial == 1) {
            TreeNode child = new TreeNode("01");
            root.children.add(child);
        }
    }
    // bfs
    private static void bfs(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        while (!q.isEmpty()) {
            TreeNode element = q.remove();
            for (int i = 0; i < element.children.size(); i++) {
                q.add(element.children.get(i));
                n += element.children.get(i).data;
            }
        }
    }

    static class TreeNode {
        String data;
        ArrayList<TreeNode> children;
        public TreeNode() {
            children = new ArrayList<>();
        }

        public TreeNode(String data) {
            this.data = data;
            children = new ArrayList<>();
        }
    }

}
